package org.example.carinventory;

public class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    // Getters
    public String getVinNumber() {
        return vinNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public String getInfo() {
        return "VIN: " + vinNumber +
                ", Make: " + make +
                ", Model: " + model +
                ", Mileage: " + mileage;
    }
}
