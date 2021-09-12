/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;

public class assignment19 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your weight (pounds): ");
        float weight = scan.nextFloat();

        System.out.print("Please enter your height (inches): ");
        float height = scan.nextFloat();

        float bmi = (weight/(height*height)) * 703 ;

        System.out.println("Your BMI is: " + bmi);
        BMICategory(bmi);

    }

    private static void BMICategory( float bmi ) {
        if (bmi < 18.5) {
            System.out.println("You are underweight. You should see a doctor.");
        }else if (bmi < 25) {
            System.out.println("You are within the ideal weight range.");
        }else {
            System.out.println("You are overweight. You should see a doctor.");
        }
    }
}