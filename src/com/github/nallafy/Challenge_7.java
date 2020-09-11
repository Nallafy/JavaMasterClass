package com.github.nallafy;

public class Challenge_7 {
    public static String getDurationString(long seconds){
        if(seconds >= 0){
            return getDurationString(seconds / 60, seconds % 60);
        }else{
            return("Invalid Value");
        }
    }
    public static String getDurationString(long minutes,long seconds){
        if(minutes >= 0 && (seconds >=0 && seconds <=59)){
            long hours = minutes / 60;
            long mins = minutes % 60;
            long secs = seconds;

            return ((String)(hours + "h " + mins + "m " + secs +"s "));

        }else{
            return("Invalid Time Entered");
        }

    }

    public static void main(String[] args){
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
    }
}
