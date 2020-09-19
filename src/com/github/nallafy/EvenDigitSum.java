package com.github.nallafy;

public class EvenDigitSum{
    public static int getEvenDigitSum(int number){
        int result;
        int temp = number;
            for(result = 0;temp !=0;){
                if(temp % 2 == 0){
                    result += (temp%10);
                }else{

                }
                    temp /=10;

            }

        return result;
    }

    public static void main(String[] args){
        System.out.println(getEvenDigitSum(12345));

    }
}
