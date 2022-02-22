package com.company;

public class ArrayFunReverselt {
    public static void main(String[] args) {
        Integer intArr[] = {1, 2, 3, 4, 5};
        Integer rvsArr[] = new Integer[intArr.length];

        for (int i = intArr.length-1; i >= 0; i--) {
            rvsArr[(intArr.length-1)-i] = intArr[i];
        }

        System.out.println("Original\tReversed\t");
        for (int i = 0; i < intArr.length; i++) {
            System.out.format("%d\t\t\t%d\n", intArr[i], rvsArr[i]);
        }
    }
}
