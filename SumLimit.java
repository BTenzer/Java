package com.company;

import java.util.Scanner;

/**
 * ~ Objective ~
 *
 * "Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same
 *  number of digits as a. If the sum has more digits than a, just return a without b."
 *
 *  src: https://codingbat.com/prob/p118077
 */

public class SumLimit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a non-negative integer for int a");
        int a = scan.nextInt();
        System.out.println("Please enter a non-negative integer for int b");
        int b = scan.nextInt();

        System.out.println(sumLimit(a, b));
    }

    public static int sumLimit(int a, int b){
        int sum = a + b;
        String aStr = String.valueOf(a);
        String sumStr = String.valueOf(sum);
        if(sumStr.length()==aStr.length()){
            return Integer.parseInt(sumStr);
        }

        return a;
    }
}
