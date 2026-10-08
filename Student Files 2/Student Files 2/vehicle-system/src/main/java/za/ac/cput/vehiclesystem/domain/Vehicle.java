package za.ac.cput.vehiclesystem.domain;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Vehicle {

    @Id
    protected String vehicleId;
    protected String model;
    protected double price;
    @ManyToOne
    private Agent agent;

    protected Vehicle() {

    }

    Vehicle(Builder<?> builder) {
        this.vehicleId = builder.vehicleId;
        this.model = builder.model;
        this.price = builder.price;
        this.agent = builder.agent;
    }

    public String getVehicleId() {
        return vehicleId;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    public Agent getAgent() { return  agent; }

    @Override
    public String toString() {
        return "Vehicle {" +
                "vehicleId='" + vehicleId + '\'' +
                ", model =" + '\'' +
                ", price=" + '\'' +
                ", agent=" + '\'' +
                "}";
    }

    public static abstract class Builder<T  extends Builder<T>> {
        private String vehicleId;
        private String model;
        private double price;
        private Agent agent;

        public T setVehicleId(String vehicleId) {
            this.vehicleId = vehicleId;
            return self();
        }

        public T setModel(String model) {
            this.model = model;
            return self();
        }

        public T setPrice(double price) {
            this.price = price;
            return self();
        }

        public T setAgent(Agent agent) {
            this.agent = agent;
            return self();
        }

        public T copy(Vehicle vehicle) {
            this.vehicleId = vehicle.vehicleId;
            this.model = vehicle.model;
            this.price = vehicle.price;
            this.agent = vehicle.agent;
            return self();
        }

        protected abstract T self();

        public abstract Vehicle build();
    }

}