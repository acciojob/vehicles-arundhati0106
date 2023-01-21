package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    //constructor
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //method implementation
    @Override
    public String getVehicleName() {
        return getName();
    }

    @Override
    public int getVehicleCapacity() {
        return getCapacity();
    }
}
