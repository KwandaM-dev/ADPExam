package za.ac.cput.vehiclesystem.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Agent {
    @Id
    private String agentId;

    @Embedded
    private Name name;
    private String email;
    private String mobile;

    protected Agent() {

    }

    private Agent(Builder builder) {
        this.agentId = builder.agentId;
        this.name = builder.name;
        this.email = builder.email;
        this.mobile = builder.mobile;

    }

    public String getAgentId() {
        return agentId;
    }

    public Name getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String toString() {
        return "Agent ID" + agentId +'\'' +
                "Name" + name + '\'' +
                "Email: " + email + '\'' +
                "Mobile: " + mobile;
    }

    public static class Builder {
        private String agentId;
        private Name name;
        private String email;
        private String mobile;

        public Builder setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {

            this.email = email;
            return this;
        }

        public Builder setMobile(String mobile) {

            this.mobile = mobile;
            return this;
        }

        public Builder copy(Agent agent) {
            this.agentId = agent.getAgentId();
            this.name = agent.getName();
            this.email = agent.getEmail();
            this.mobile = agent.getMobile();
            return this;
        }

        public Agent build() {
            return new Agent(this);
        }

    }

}
