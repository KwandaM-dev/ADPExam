package za.ac.cput.vehiclesystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.vehiclesystem.domain.Car;
import za.ac.cput.vehiclesystem.repository.CarRepository;

import java.util.List;

public interface ICarService extends IService{
    List<Car> findAll();

}
