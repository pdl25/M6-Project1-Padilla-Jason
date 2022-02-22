package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        Object intArr[] = new Object[5];
        int count = 0;
//        Keep asking user to input numbers until 5 valid numbers are stored
        while (true) {
            Scanner userInput = new Scanner(System.in);
            System.out.format("Please enter %d numbers: \n", 5-count);
            String numbers = userInput.nextLine();
            String[] arrOfStr = numbers.split(" ");

//            Search through the arr of inputs
            for (String num: arrOfStr) {
//                Use regex to match for only numbers
                String regex = "[-]?([0-9]*[.])?[0-9]+";
                Pattern pt = Pattern.compile(regex);
                Matcher mt = pt.matcher(num);

                if (mt.matches() && count < 5) {
                    regex = "[-]?[0-9]*[.][0-9]+";
                    pt = Pattern.compile(regex);
                    mt = pt.matcher(num);
//                    match for doubles
                    if(mt.matches()) {
                        intArr[count] = Double.parseDouble(num);
                    }
//                    match for integers
                    else {
                        intArr[count] = Integer.parseInt(num);
                    }
                    count++;
                }
            }
            if (count >= 5) {
                break;
            }
        }
        for (Object i: intArr) {
            System.out.println(i);
        }
    }
}
