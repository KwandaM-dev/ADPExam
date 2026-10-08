package za.ac.cput.vehiclesystem.factory;



import za.ac.cput.vehiclesystem.domain.Agent;
import za.ac.cput.vehiclesystem.domain.Vehicle;
import za.ac.cput.vehiclesystem.util.Helper;

public class VehicleFactory {
    public static Vehicle createVehicle(
            String vehicleId,
            String model,
            double price,
            Agent agent
    ) {
        if(Helper.isNullOrEmpty(vehicleId) || Helper.isNullOrEmpty(model)){
            return null;
        }


        return new Vehicle.Builder() {
            @Override
            protected Vehicle.Builder self() {
                return null;
            }

            @Override
            public Vehicle build() {
                return null;
            }
        }
                .setVehicleId(vehicleId)
                .setModel(model)
                .setPrice(price)
                .setAgent(agent)
                .build();
    }
}



