package com.github.nallafy;
import java.util.Scanner;
public class Challenge_8 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        boolean isnumber;
        int number = 0;


        for(int i = 0; i < 10;){
            System.out.println("Enter number #" + (i+1) +": ");
           isnumber = s.hasNextInt();
           if(isnumber){
               number += s.nextInt();
               s.nextLine();
               ++i;
           }else{
               System.out.println("Sorry but that's an invalid number! Try Again!");
               s.nextLine();
           }

        }
        s.close();
        System.out.println("SUM IS: " + (number));
    }


}
