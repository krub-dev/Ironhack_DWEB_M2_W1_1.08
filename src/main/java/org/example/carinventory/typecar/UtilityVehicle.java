package org.example.carinventory.typecar;
import org.example.carinventory.Car;

public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public String getFourWheelDriveInfo() {
        if (fourWheelDrive) {
            return "Yes";
        } else {
            return "No";
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", 4 Wheels Drive: " + getFourWheelDriveInfo();
    }
}