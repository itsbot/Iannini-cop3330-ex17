/*
 *  UCF COP3330 Fall 2021 Exercise 17 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise17;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sex, ounces, weight, hours;
            System.out.println("Enter a 1 if you are male or 2 if you are female: ");
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid integer");
                sc.next();
            }
            sex = sc.nextInt();
            System.out.println("How many ounces of alcohol did you have?");
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid integer");
                sc.next();
            }
            ounces = sc.nextInt();
            System.out.println("What is your weight in pounds?");
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid integer");
                sc.next();
            }
            weight = sc.nextInt();
            System.out.println("How many hours has it been since your last drink?");
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid integer");
                sc.next();
            }
            hours = sc.nextInt();


            double rM = 0.73;
            double rW = 0.66;
            double bac = 0;
            DecimalFormat df = new DecimalFormat("0.000000");

            if (sex == 1) {
                bac = (ounces * 5.14 / weight * rM - (0.015 * hours));
            } else if (sex == 2) {
                bac = (ounces * 5.14 / weight * rW - (0.015 * hours));
            }
            if (bac < 0.08) {
                System.out.println("Your BAC is " + df.format(bac) + "\nIt is legal for you to drive");
            } else {
                System.out.println("Your BAC is " + df.format(bac) + "\nIt is not legal for you to drive");
            }
        sc.close();
    }
}
