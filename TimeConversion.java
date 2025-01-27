// A program that seems to convert times into various forms.

import java.util.Scanner;
public class TimeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time;
        System.out.print("Enter time in seconds: ");  
        time = input.nextInt();
        //converting time into  mins and secs
        int timeInMins = time / 60;
        int seconds = time % 60;

        //converting time into hrs, mins and secs...
        int timeInHours = timeInMins / 60;
        int minutes = timeInMins % 60;

        //converting time into days, hours, ...
        int timeInDays = timeInHours / 24;
        int hours = timeInHours % 24;

        //converting time into weeks, days,....
        int timeInWeeks = timeInDays / 7;
        int days = timeInDays % 7;

        //converting time into months, weeks, days....
        int timeInMonths = timeInWeeks / 4;
        int weeks = timeInWeeks % 4;

        //converting time into years, months, weeks, ....
        int timeInYears = timeInMonths / 12;
        int months = timeInMonths % 12;

        //converting time into decade, years, months....
        int timeInDecades = timeInYears / 10;
        int years = timeInYears % 10;

        System.out.println(time + " seconds  is " + years + " years, " + months + " months, " + weeks + " weeks, " + days + " days, " + hours + " hours, " +  minutes + " mins and " + seconds + " seconds.");
        input.close();
    } 
}
