package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayFun5Words {
    public static void main(String[] args) {
        String wordsArr[] = new String[5];
        int count = 0;
//        Keep asking user to input values until 5 words are stored
        while (true) {
            Scanner userInput = new Scanner(System.in);
            System.out.format("Please enter %d words: \n", 5-count);
            String words = userInput.nextLine();
            String[] arrOfWords = words.split(" ");

//            Search through the arr of inputs
            for (String word: arrOfWords) {
//                Use regex to match for only words
                String regex = "[a-zA-Z]*";
                Pattern pt = Pattern.compile(regex);
                Matcher mt = pt.matcher(word);

//              Add value to array if it is a word
                if (mt.matches() && count < 5) {
                    wordsArr[count] = word;
                    count++;
                }
            }
            if (count >= 5) {
                break;
            }
        }
        for (Object i: wordsArr) {
            System.out.println(i);
        }
    }
}
