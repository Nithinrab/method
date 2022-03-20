package com.harman;

public class methodoverloading {
    public int multiply(int a,int b){
        return a*b;
    }
    public int multiply(int a,int b, int c){
        return a*b*c;
    }
    public double multiple(double a,double b){
        return a*b;
    }
    public static void main(String[] args) {
        methodoverloading ob=new methodoverloading();
        int result1 = ob.multiply(5,5);
        int result2 = ob.multiply(1,2,5);
        System.out.println(result1);
        System.out.println(result2);
    }
}

