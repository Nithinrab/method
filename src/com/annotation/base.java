package com.annotation;

public class base {
    void display(){
        System.out.println("parent class");

    }
}
class child extends base{
    @Override
    void display() {
        super.display();
    }

    public static void main(String[] args) {
        child c=new child();
        c.display();
    }
}