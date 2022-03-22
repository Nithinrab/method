package com.harman;
import java.util.Scanner;
class addop extends Thread {
    int a, b;

    public addop(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        try {
            System.out.println(a + b);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class subop extends Thread {
    int x, y;

    public  subop(int x, int y){
        this.x =x;
        this.y = y;
    }
    @Override
    public void run() {
        try {
            System.out.println("difference is : "+ (x-y));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

class mulop extends Thread {
    int x, y;

    public  mulop(int x, int y){
        this.x =x;
        this.y = y;
    }
    @Override
    public void run() {
        try {
            System.out.println("product  is : "+ (x*y));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class divop extends Thread {
    int x, y;

    public  divop(int x, int y){
        this.x =x;
        this.y = y;
    }
    @Override
    public void run() {
        try {
            System.out.println("ratio is : "+ (x/y));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class Operate {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter no 1 :");

        int x = s.nextInt();
        System.out.println("enter no 2 :");
        int y = s.nextInt();

        addop a = new addop(x, y);
        subop b = new subop(x, y);
        mulop c = new mulop(x, y);
        divop d = new divop(x, y);
        a.start();
        b.start();
        c.start();
        d.start();

    }
}

