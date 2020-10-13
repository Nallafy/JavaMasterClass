package com.github.nallafy.classcarexercise;

public class Vehicle {
       private String Name;
       private String Size;

       private int currentVelocity;
       private int currentDirection;

       //constructors
    public Vehicle(){
        setName("Unknown");
        setSize("Unknown");

        setCurrentDirection(0);
        setCurrentVelocity(0);
    }
    public Vehicle(String Name, String Size){
        this.Name = Name;
        this.Size = Size;
        this.currentVelocity = 0;
        this.currentDirection = 0;

    }
    public Vehicle(String Name, String Size, int currentVelocity, int currentDirection){
        this.Name = Name;
        this.Size = Size;
        this.currentVelocity = currentVelocity;
        this.currentDirection = currentDirection;

    }

    //methods
    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + this.currentDirection);
    }

    public void movement(int velocity, int direction){
        this.currentVelocity += velocity;
        this.currentDirection += direction;
        System.out.println("Vehicle.movement(): moving at " + this.currentDirection + " at the speed of "+ this.currentVelocity);
    }

    public void stop(){
        this.currentVelocity = 0;
        System.out.println("Vehicle.stop(): Moving at " + this.currentVelocity + " in Direction " + this.currentDirection);
    }

    public String getName() {

        return Name;
    }

    public void setName(String name) {
        
        Name = name;
    }

    public String getSize() {

        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}

