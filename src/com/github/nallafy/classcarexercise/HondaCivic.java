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
        System.out.println("Road Service Months: "+getRoadServiceMonths());

    }
    public void displayPreview(){
        System.out.println("Name: "+getName());
        System.out.println("Size: "+getSize());
        System.out.println("Wheels: "+getWheels());
        System.out.println("Doors: "+getDoors());
        System.out.println("Gears: "+getGears());
        System.out.println("Manual Transmission: "+isManual());
        System.out.println("Moving Direction: "+getCurrentDirection());
        System.out.println("Moving Speed: "+getCurrentVelocity());
        System.out.println("Road Service Months: "+getRoadServiceMonths());

    }
    public void transmissionGear(int rate){
        int newVelo = getCurrentVelocity() + rate;
        if(newVelo == 0){
            stop();
            changeCurrentGear(0);
            changeMovement(newVelo, getCurrentDirection());
        }else if(newVelo > 0 && newVelo <=10){
            changeCurrentGear(1);
            changeMovement(newVelo, getCurrentDirection());
        }else if(newVelo > 10 && newVelo <=20){
            changeCurrentGear(2);
            changeMovement(newVelo, getCurrentDirection());
        }else if(newVelo > 20 && newVelo <=30){
            changeCurrentGear(3);
            changeMovement(newVelo, getCurrentDirection());
        }else if(newVelo > 30 && newVelo <=40){
            changeCurrentGear(4);
            changeMovement(newVelo, getCurrentDirection());
        }else if(newVelo > 40){
            changeCurrentGear(5);
            changeMovement(newVelo, getCurrentDirection());

        } else{
            changeCurrentGear(6);
            changeMovement(newVelo, getCurrentDirection());
        }
    }
}
