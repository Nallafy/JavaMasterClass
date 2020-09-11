package com.github.nallafy;

public class MethodPractice {
    public static int calculateAnswer(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = ((score + (levelCompleted * bonus)) +2000);
            return finalScore;
        }
        return -1;

    }

    public static void displayLeaderboardPosition(String player, int highScorePosition){
        System.out.println(player + " in position " + highScorePosition + " on the leaderboards.");


    }
    public static int calculateHighscore(int playerScore){
        int position;
        if(playerScore >= 1000){
            position = 1;
        }else if(playerScore >= 500){
            position = 2;
        }else if(playerScore >=100){
            position = 3;
        }else{
            position = 4;
        }

        return position;
    }

    public static void main(String[] args){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highscore = calculateAnswer(gameOver, score, levelCompleted, bonus);

        System.out.println("Your final score is: " +highscore);
       //======================================================================================
        System.out.println("===============================================================");
        {
            displayLeaderboardPosition("Tim",calculateHighscore(1500));
            displayLeaderboardPosition("Bob",calculateHighscore(900));
            displayLeaderboardPosition("Percy",calculateHighscore(400));
            displayLeaderboardPosition("Gilbert",calculateHighscore(50));
        }


    }

}
