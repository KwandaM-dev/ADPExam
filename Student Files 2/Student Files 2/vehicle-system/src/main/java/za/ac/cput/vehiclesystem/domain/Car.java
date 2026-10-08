package za.ac.cput.vehiclesystem.domain;

import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle {
    private int numberOfDoors;

    protected Car() {
        super();
    }

    private Car(Builder builder) {
        super(builder);
        this.numberOfDoors = builder.numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n numberOfDoors: " + numberOfDoors +'}';
    }

    public static class Builder extends Vehicle.Builder<Builder> {
        private int numberOfDoors;

        @Override
        protected Builder self() {
            return this;
        }

        public Builder numberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return self();
        }

        @Override
        public Vehicle build() {
            return new Car(this);
        }
    }



}