package com.princeapk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a program that accepts user input
        // of a week day number and displays the
        // corresponding day using switch statement

        Scanner wd = new Scanner(System.in);

        System.out.println("*********************************");
        System.out.println("Enter Any Number from 1 - 7: ");
        System.out.println("*********************************\n");

        int day = wd.nextInt();

        String dayName = "";


        switch(day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "An Invalid Selection"; break;
        }
        System.out.println("\nYou Selected: " + dayName);


        wd.close();

    }
}
