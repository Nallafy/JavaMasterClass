package com.github.nallafy;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){
        int baseline;
        int count = 1;
        int GCD = 0;
        if(first < 10 || second < 10){
            return -1;
        }else{

            if (first >= second) {
                baseline = first;
            } else {
                baseline = second;
            }
            while (count <= baseline) {
                if ((first % count == 0) && (second % count == 0)) {
                    GCD = count;
                    ++count;
                } else {
                    ++count;
                }
            }

        }
        return GCD;
    }

    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
}
