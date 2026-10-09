package za.ac.cput.vehiclesystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.vehiclesystem.domain.Agent;
import za.ac.cput.vehiclesystem.repository.AgentRepository;

import java.util.List;

@Service
public class AgentService implements IAgentService {
    private final AgentRepository agentService;

    @Autowired
    public AgentService(AgentRepository agentService) {
        this.agentService = agentService;
    }

    @Override
    public List<Agent> getAll() {
        return agentService.findAll();
    }

    @Override
    public Agent getByAgentId(String agentId) {
        return agentService.findAgentById(agentId);
    }

    @Override
    public Agent create(Agent agent) {
        return agentService.save(agent);
    }

    @Override
    public Agent read(String agentId) {
        return agentService.findAgentById(agentId);
    }

    @Override
    public Agent update(Agent  agent) {
        return agentService.save(agent);
    }

    @Override
    public boolean delete(String agentId) {
        if(agentService.existsById(agentId)){
            agentService.deleteById(agentId);
        }
        return false;
    }
}
