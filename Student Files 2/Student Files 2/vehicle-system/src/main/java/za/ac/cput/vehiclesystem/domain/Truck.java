package za.ac.cput.vehiclesystem.domain;

import jakarta.persistence.Entity;

@Entity
public class Truck extends Vehicle {
    private double loadCapacity;

    protected Truck() {
        super();
    }

    private Truck(Builder builder) {
        super(builder);
        this.loadCapacity = builder.loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +"Truck [loadCapacity=" + loadCapacity + "]";
    }

    public static class Builder  extends Vehicle.Builder<Builder> {
        private double loadCapacity;

        @Override
        protected Builder self() {
            return self();
        }
        public Builder loadCapacity(double loadCapacity) {
            this.loadCapacity = loadCapacity;
            return self();
        }

        @Override
        public Vehicle build() {
            return new  Truck(this);
        }
    }

}