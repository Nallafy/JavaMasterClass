package com.github.nallafy;
import java.util.Scanner;
public class howscannersowrk {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("/t==============Normal way, no terminators============");
        System.out.println("Enter you name: ");
        String name = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println(name + " " + (age));

        System.out.println("/t==============Invalid way, terminators============");

        System.out.println("Enter your age: ");
        age = input.nextInt();

        System.out.println("Enter your name: ");
        name = input.nextLine();

        System.out.println(name + " " + (age));

        System.out.println("/t==============How to mitigate terminators============");
        System.out.println("Enter your age: ");
        age = input.nextInt();
        input.nextLine(); // do this for every non string input

        System.out.println("Enter your name: ");
        name = input.nextLine();

        System.out.println(name + " " + (age));


    }
}
