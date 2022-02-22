package com.company;

import java.util.Scanner;

public class MonthConverterIf {
    public static void main(String[] args) {
        String converter[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
        "October", "November", "December"};
        while(true) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter a number between 1 and 12: ");
            try {
                Integer month = userInput.nextInt();

                if (0 < month && month <= 12) {
                    System.out.println(converter[month-1]);
                    break;
                }
                else {
                    System.out.println("You have entered an invalid number. You must enter a number between 1 and 12.");
                }
            }
            catch(Exception e) {
                System.out.println("You have entered an invalid number. You must enter a number between 1 and 12.");
            }
        }
        System.out.println("Goodbye.");
    }
}
