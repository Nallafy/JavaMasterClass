package com.github.nallafy.poolareapractice;

public class Cuboid extends Rectangle {
    private double height;
    public Cuboid(double width, double length, double height){
        super(width, length);
        this.height = (height <0.0) ? (this.height = 0) : (this.height = height);

    }

    //methods


    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return (getArea() * getHeight());
    }
}
