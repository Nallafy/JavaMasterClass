package com.github.nallafy;

import com.sun.security.jgss.GSSUtil;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        return ((num1 >= 10 && num1 <=99) == (num2 >= 10 && num2 <=99));
    }

    public static void main(String[] args){
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15, 55));
    }
}
