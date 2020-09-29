package com.github.nallafy.classcarexercise;

public class Main {
    public static void main(String[] args){
        HondaCivic civic1 = new HondaCivic();
        HondaCivic civic2Race = new HondaCivic(26, 120, 6);
//        civic1.setRoadServiceMonths(6);
//        civic1.displayInfo();

        civic2Race.displayPreview();
        civic2Race.transmissionGear(-100);
        civic2Race.displayPreview();
    }

}
