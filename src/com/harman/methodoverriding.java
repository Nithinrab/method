package com.harman;

public class methodoverriding {
    void runn(){
        System.out.println("Its question number 2");
    }
}
class bike extends methodoverriding{
    public static void main(String[] args) {
        bike ob=new bike();
        ob.runn();
    }
}
