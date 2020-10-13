package com.github.nallafy;

public class methodOverload {
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Player Tim"  + " scored " + score + " points");
        return score * 1000;
    }
    public static void main(String[] args){
        calculateScore("Shawn", 100)  ;
        calculateScore(500);
    }

}
