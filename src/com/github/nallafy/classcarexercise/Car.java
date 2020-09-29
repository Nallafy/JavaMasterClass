package com.github.nallafy.classcarexercise;

public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(){
        this.wheels = 0;
        this.doors = 0;
        this.gears = 0;
        this.isManual = false;
        this.currentGear = 0;
    }
    public Car(int wheels, int doors, int gears, boolean isManual) {
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }


    public Car(String Name, String Size, int currentVelocity, int currentDirection, int wheels, int doors, int gears, boolean isManual) {
        super(Name, Size, currentVelocity, currentDirection);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    //===========setters and getters

    public void changeCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeCurrentGear(): Changed to " + this.currentGear);
    }
    public int getCurrentGear() {
        return this.currentGear;
    }



    public void changeMovement(int velocity, int direction) {
        super.movement(velocity, direction);
        System.out.println("Car.changeMovement(): Velocity:"  + velocity + " at Direction: " + direction);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    //    @Override
//    public void stop(){
//
//    }


}
