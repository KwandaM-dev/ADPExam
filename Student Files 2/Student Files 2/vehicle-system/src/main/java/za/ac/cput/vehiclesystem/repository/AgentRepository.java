package za.ac.cput.vehiclesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclesystem.domain.Agent;

import java.util.List;

@Repository
public interface AgentRepository extends JpaRepository<Agent, String> {
    List<Agent> findAll();
    Agent  findAgentById(String agentId);
}