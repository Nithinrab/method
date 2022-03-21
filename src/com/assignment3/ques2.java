package com.assignment3;
import java.util.Scanner;
public class ques2 {

        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);

            System.out.print("Enter the number: ");
            int num = in.nextInt();

            double sqrtValue = Math.sqrt(num);
            long roundSqrt = Math.round(sqrtValue);

            System.out.println("Square root of " + num + " = " + sqrtValue);
            System.out.println("Rounded form = " + roundSqrt);

        }
    }

