package com.github.nallafy.objectoriented;
import java.util.Scanner;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;
    Scanner s = new Scanner(System.in);

    void getInputs(){
        String pubModel;
        String pubEngine;
        String pubColour;

        System.out.print("Car model: ");
        pubModel = s.nextLine();
        model = pubModel;

        System.out.print("Car engine: ");
        pubEngine = s.nextLine();
        engine = pubEngine;

        System.out.print("Colour: ");
        pubColour = s.nextLine();
        colour = pubColour;
    }

    void displayOutput(){
        System.out.println("Car model: " + model);
        System.out.println("Car engine: " + engine);
        System.out.println("Colour: " + colour);
    }

}
