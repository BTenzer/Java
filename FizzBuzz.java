package com.company;

/**
 * ~ Objective ~
 *
 * "Write a program that prints the numbers from 1 to 100. But for
 *  multiples of three print “Fizz” instead of the number and for the
 *  multiples of five print “Buzz”. For numbers which are multiples of both
 *  three and five print “FizzBuzz”."
 *
 *  src: http://wiki.c2.com/?FizzBuzzTest
 */

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 0; i < 101; i++){
            if (i%3==0 && i%5==0){ // if current number is divisible by both 3 and 5, print FizzBuzz
                System.out.println("FizzBuzz");
            } else if (i%3==0){
                System.out.println("Fizz"); // if only divisible by 3, print Fizz
            } else if (i%5==0){
                System.out.println("Buzz"); // if only divisible by 5, print Buzz
            } else { // the order of the last two doesn't matter since it can only be one or the other
                System.out.println(i); // print the value of i if it is not a multiple of 3, 5, or both
            }
        }
    }
}
