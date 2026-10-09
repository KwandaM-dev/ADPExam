package za.ac.cput.vehiclesystem.factory;

import za.ac.cput.vehiclesystem.domain.Agent;
import za.ac.cput.vehiclesystem.domain.Name;
import za.ac.cput.vehiclesystem.util.Helper;

public class AgentFactory {
    public static Agent createAgent(
            String agentId,
            Name name,
            String email,
            String mobile) {
        if (Helper.isNullOrEmpty(agentId) || Helper.isNullOrEmpty(email)
                || Helper.isNullOrEmpty(mobile)) {
            return null;
        }

        if(!Helper.isValidMobile(mobile)) {
            return null;
        }

        return new Agent.Builder()
                .setAgentId(agentId)
                .setName(name)
                .setEmail(email)
                .setMobile(mobile)
                .build();

    }



}
