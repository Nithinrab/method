package com.harman;
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1,n2,result1,result2;
        System.out.println("Enter num1");
        n1= input.nextInt();
        System.out.println("Enter num2");
        n2= input.nextInt();
        result1=n1+n2;
        result2=n1*n2;
        System.out.println("Addition: "+result1);
        System.out.println("Multiplication: "+result2);
    }
}

