package za.ac.cput.vehiclesystem.service;

import org.springframework.stereotype.Service;
import za.ac.cput.vehiclesystem.domain.Agent;
import za.ac.cput.vehiclesystem.repository.AgentRepository;

import java.util.List;

@Service
public class AgentService implements IAgentService {
    private AgentRepository _agentService;

    @Override
    public Object create(Object object) {
        Agent agent = (Agent) object;
        _agentService.save(agent);
        return agent;
    }

    @Override
    public Object read(Object o) {
        Agent agent = (Agent) o;
        _agentService.getAgentByAgentId(agent.getAgentId());
        return agent;
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
    public List<Agent> getAgents() {
        return List.of();
    }
}
