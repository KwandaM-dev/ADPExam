package za.ac.cput.vehiclesystem.domain;

import jakarta.persistence.Entity;

@Entity
public class Motorcycle extends Vehicle {

    private int engineCapacity;

    protected Motorcycle() {
        super();
    }

    private Motorcycle (Builder builder) {
        super(builder);
        this.engineCapacity = builder.engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +"Motorcycle [engineCapacity=" + engineCapacity + "]";
    }

    public static class Builder extends Vehicle.Builder<Builder> {
        private int engineCapacity;

        @Override
        protected Builder self() {
            return this;
        }

        public Builder engineCapacity(int engineCapacity) {
            this.engineCapacity = engineCapacity;
            return self();
        }

        @Override
        public Vehicle build() {
            return new Motorcycle(this);
        }
    }

}
