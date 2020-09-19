package com.github.nallafy;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        boolean result = true;

        result = (((num1 >= 10 && num1 <= 1000)
                && (num2 >= 10 && num2 <= 1000)
                && (num3 >= 10 && num3 <= 1000))
                ) && ((num1%10 == num2%10 || num1%10 == num3%10)||
                        (num2%10 == num1%10 || num2%10 == num3%10)||
                        (num3%10 == num1%10 || num3%10 == num2%10));

        return result;
    }
    public static void main(String[] args){
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9,99,999));
    }
}
