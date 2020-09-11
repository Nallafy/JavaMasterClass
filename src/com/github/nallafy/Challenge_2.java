package com.github.nallafy;

public class Challenge_2 {
    public static void checkNumber(int number){
        boolean result;
        result = (number > 0 )? true : false;
        if(number > 0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }


    }

    public static void main(String[] args){
        checkNumber(10);
    }
}
