package za.ac.cput.vehiclesystem.service;


import za.ac.cput.vehiclesystem.domain.Agent;

import java.util.List;

public interface IAgentService extends IService{
    List<Agent> findAll();
    Agent findById(Agent agen);
}
