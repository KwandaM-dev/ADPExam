package za.ac.cput.vehiclesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.vehiclesystem.domain.Car;

public interface CarRepository extends JpaRepository<Car, String> {
    Car findByModel(String model);
    Car getCarByCarId(String model);
}
