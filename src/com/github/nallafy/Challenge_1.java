package com.github.nallafy;

public class Challenge_1 {
    public static void main(String[]args){
        double firstNum = 20.00d;
        double secNum = 80.00d;
        double result = (firstNum + secNum) * 100.00d;
        System.out.println("Result = " + result);
        double remainder = result % 40.00d;
        System.out.println("Remainder = " + remainder);
        boolean remain = remainder == 0 ? true : false;
        System.out.println(remain);

       if(remain == false){
           System.out.println("Got some remainder!");
       }else{
           System.out.println("No Remainder!");
       }



    }
}
