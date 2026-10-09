package za.ac.cput.vehiclesystem.factory;



import za.ac.cput.vehiclesystem.domain.Agent;
import za.ac.cput.vehiclesystem.domain.Vehicle;
import za.ac.cput.vehiclesystem.util.Helper;

import java.util.function.Supplier;

public class VehicleFactory {

    public static <T extends Vehicle.Builder<T>> Vehicle createVehicle(
            Supplier<T> builderSupplier,
            String vehicleId,
            String model,
            double price,
            Agent agent
    ) {
        if(Helper.isNullOrEmpty(vehicleId)&&Helper.isNullOrEmpty(model)) {
            return null;
        }

        if(price < 0){
            return null;
        }

        if(agent==null){
            return null;
        }

        return builderSupplier.get()
                .setVehicleId(vehicleId)
                .setModel(model)
                .setPrice(price)
                .setAgent(agent)
                .build();
    }
}



