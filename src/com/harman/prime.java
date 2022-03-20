package com.harman;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b,i,j;
        System.out.println("Starting number:");
        a = s.nextInt();
        System.out.println("Ending number:");
        b = s.nextInt();
        for(i=a;i<=b;i++){
            for(j=2;j<=i;j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if(i==j){
                System.out.println(j);
            }
        }
    }
}

