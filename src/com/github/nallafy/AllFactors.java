package com.github.nallafy;

public class AllFactors {

    public static void printFactors(int number){
        String answer = "print";
        short counter = 1;
        if(number < 1){
            System.out.println("invalid value");
        }
        while(counter <= number){
            if(number % counter == 0){
                answer = (answer + ((" ")+(String.valueOf((counter)))));
                ++counter;
            }else{
                ++counter;
            }

        }
        System.out.println(answer);
    }

    public static void main(String[] args){

        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);

    }
}
