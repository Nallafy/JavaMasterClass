package com.github.nallafy.cylinderpractice;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius ,double height) {
        super(radius);
        if(height <=0){
            height = 0;
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    //methods

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return(getArea() * getHeight());
    }
}
