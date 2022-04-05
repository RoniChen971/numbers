package com;

import java.util.Scanner;

public class numberAndDigits {

        public static void numberAndDigits() {
            numberDigits();
        }
        private static void numberDigits() {

            int num;
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a number with 3 digits ");
            num = scan.nextInt();
            System.out.println("The first number is: " + (num % 10));
            System.out.println("The second number is: " + (num / 10 % 10));
            System.out.println("The third number is: " + (num / 100 % 10));

        }
    }