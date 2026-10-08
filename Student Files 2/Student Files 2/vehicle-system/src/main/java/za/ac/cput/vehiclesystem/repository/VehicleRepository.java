package za.ac.cput.vehiclesystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.vehiclesystem.domain.Vehicle;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, String> {
    Vehicle findByVehicleId(String vehicleId);
    Vehicle deleteByVehicleId(String vehicleId);

    List<Vehicle> readVehicleByVehicleId(String vehicleId);
}
