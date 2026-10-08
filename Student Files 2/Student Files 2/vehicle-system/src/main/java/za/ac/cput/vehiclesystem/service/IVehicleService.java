package za.ac.cput.vehiclesystem.service;

import za.ac.cput.vehiclesystem.domain.Vehicle;

import java.util.List;

public interface IVehicleService extends IService{
    List<Vehicle> getAllVehicles();
}