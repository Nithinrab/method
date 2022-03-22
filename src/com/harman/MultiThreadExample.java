package com.harman;

class Task extends Thread{
    @Override
    public void run() {
        System.out.println("thread executed -"+Thread.currentThread().getName());

    }
}
public class MultiThreadExample{
    public static void main(String[] args) {
        Task t = new Task();
        t.start();
        Task t1 = new Task();
        t1.start();
        Task t2=new Task();
        t2.start();
    }
}