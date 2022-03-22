package com.harman;

class Task1 extends Thread{
    @Override
    public void run() {
        System.out.println("task 1 thread executed -"+Thread.currentThread().getName());

    }
}
class Task2 extends Thread {
    @Override
    public void run() {
        System.out.println("task 2 thread executed -" + Thread.currentThread().getName());

    }
}
class Task3 extends Thread {
    @Override
    public void run() {
        System.out.println("task 3 thread executed -" + Thread.currentThread().getName());

    }
}
public class MultiThreadExample{
    public static void main(String[] args) {
       Task1 t1 = new Task1();
       t1.start();
        Task2 t2 = new Task2();
        t2.start();
        Task3 t3 = new Task3();
        t3.start();
    }
}