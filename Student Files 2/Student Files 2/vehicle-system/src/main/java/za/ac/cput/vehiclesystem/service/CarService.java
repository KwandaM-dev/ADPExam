package za.ac.cput.vehiclesystem.service;

import org.springframework.stereotype.Service;
import za.ac.cput.vehiclesystem.domain.Car;
import za.ac.cput.vehiclesystem.repository.CarRepository;

import java.util.List;

@Service
public class CarService implements ICarService {
    private CarRepository carRepository;



    @Override
    public Object create(Object o) {
        Car car = (Car) o;
        carRepository.save(car);
        return car;
    }

    @Override
    public Object read(Object o) {
        Car car = (Car) o;
        carRepository.get
    }

    @Override
    public Object update(Object o) {
        return null;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public List<Car> findAll() {
        return List.of();
    }
}