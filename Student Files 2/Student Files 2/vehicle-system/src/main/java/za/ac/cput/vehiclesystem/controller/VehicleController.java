package za.ac.cput.vehiclesystem.controller;

import org.springframework.web.bind.annotation.*;
import za.ac.cput.vehiclesystem.domain.Vehicle;
import za.ac.cput.vehiclesystem.repository.AgentRepository;
import za.ac.cput.vehiclesystem.repository.VehicleRepository;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {


    private final VehicleRepository vehicleRepository;

    public VehicleController(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @PostMapping("/create")
    public String createVehicle() {


    }

    @GetMapping("/read")
    public String readVehicles() {

    }

    @PostMapping("/update")
    public String updateVehicle() {

    }

    @DeleteMapping
    public String deleteVehicle(String vehicleId) {
        vehicleRepository.deleteByVehicleId(vehicleId);
        return vehicleId;
    }

    @GetMapping
    public List<Vehicle> getVehicles() {
        return vehicleRepository.findAll();
    }




}
