package za.ac.cput.vehiclesystem.service;

import org.springframework.stereotype.Service;
import za.ac.cput.vehiclesystem.domain.Vehicle;
import za.ac.cput.vehiclesystem.factory.VehicleFactory;
import za.ac.cput.vehiclesystem.repository.VehicleRepository;

import java.util.List;

@Service
public class VehicleService implements IVehicleService {
    private final VehicleRepository vehicleRepository;
    private IVehicleService vehicleService;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }


    @Override
    public Object create(Object o) {
        Vehicle vehicle = (Vehicle) o;
        return vehicleService.create(vehicle);

    }

    @Override
    public Object read(Object o) {
        Vehicle vehicle = (Vehicle) o;
        vehicleRepository.readVehicleByVehicleId(vehicle.getVehicleId());
        return vehicle;
    }

    @Override
    public Object update(Object o) {
        Vehicle vehicle = (Vehicle) o;
        return vehicleService.update(vehicle);

    }

    @Override
    public boolean delete(Object o) {
        Vehicle vehicle = (Vehicle) o;
        vehicleRepository.deleteByVehicleId(vehicle.getVehicleId());
        return true;
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }
}
