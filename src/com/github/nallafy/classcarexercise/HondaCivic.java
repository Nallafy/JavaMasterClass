package com.github.nallafy.classcarexercise;

public class HondaCivic extends Car {
    private int roadServiceMonths;
    public HondaCivic(){
        super("Honda Civic", "4WD", 0, 0, 5, 5, 6, false);
    }

    public HondaCivic(int currentVelocity, int currentDirection, int roadServiceMonths) {
        super("Honda Civic", "4WD", currentVelocity, currentDirection, 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    //methods

    public int getRoadServiceMonths() {
        return roadServiceMonths;
    }

    public void setRoadServiceMonths(int roadServiceMonths) {
        this.roadServiceMonths = roadServiceMonths;
    }

    public void displayInfo(){
        System.out.println("Name: "+getName());
        System.out.println("Size: "+getSize());
        System.out.println("Wheels: "+getWheels());
        System.out.println("Doors: "+getDoors());
        System.out.println("Gears: "+getGears());
        System.out.println("Transmission: "+isManual());


    }
    public void displayPreview(){
        System.out.println("Name: "+getName());
        System.out.println("Size: "+getSize());
        System.out.println("Wheels: "+getWheels());
        System.out.println("Doors: "+getDoors());
        System.out.println("Gears: "+getGears());
        System.out.println("Transmission: "+isManual());
        System.out.println("Moving Direction: "+getCurrentDirection());
        System.out.println("Moving Speed: "+getCurrentVelocity());
        System.out.println("Road Service Months: "+getRoadServiceMonths());

    }
}
