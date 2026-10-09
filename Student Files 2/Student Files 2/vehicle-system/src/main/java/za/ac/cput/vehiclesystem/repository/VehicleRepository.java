package za.ac.cput.vehiclesystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclesystem.domain.Car;
import za.ac.cput.vehiclesystem.domain.Vehicle;

import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {
    List<Vehicle> findAll();
    Optional<Vehicle> findByVehicleId(String vehicleId);

}
