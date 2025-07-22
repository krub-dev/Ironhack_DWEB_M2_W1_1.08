package org.example.carinventory.typecar;
import org.example.carinventory.Car;

public class Truck extends Car {
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public String getTowingCapacityInfo() {
        return String.valueOf(towingCapacity);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Towing Capacity: " + getTowingCapacityInfo();
    }
}
