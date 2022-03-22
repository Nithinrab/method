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
    @Deprecated
    void calculate(){
        System.out.println("calculator");
    }
    public @interface myannotation{
        int age();
        String name();
    }
@myannotation(
       age = 21, name = "nithin")
    public static void main(String[] args) {
        child c=new child();
        c.display();
  @SuppressWarnings("unused")
        int x;
c.calculate();
    }
}