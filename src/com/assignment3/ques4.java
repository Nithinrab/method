package com.assignment3;
import java.util.Scanner;
public class ques4 {

    public static void main(String[] args){
        int year;
        System.out.println("Enter year: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Year of birth is a leap year");
        else
            System.out.println("Year of birth is not a leap year");
    }

}

