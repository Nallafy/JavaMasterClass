package com.github.nallafy;

public class CastingJava {
    public static void main(String[] args){
        int x = 100;
        byte theNumber;
        theNumber = (byte)(x/5) ;

        byte bValue = 10;
        short sValue = 20;
        int iValue = 50;

        long longTotal = 50000L + 10L * (bValue + sValue + iValue); //Putting L determines the value as LONG

        short shortTotal = (short)(1000 + 10 *(bValue + sValue + iValue)); //short doesn't have the same feature as LONG,
        //you have to cast it specifically

    }
}
