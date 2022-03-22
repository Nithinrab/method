package com;

    abstract class abstra
    {
        abstract void message();
    }
    class subclass1 extends abstra{

        public void message(){

            System.out.println("This is first subclass: ");

        }

    }
    class subclass2 extends abstra{

        public void message(){

            System.out.println("This is Second subclass: ");

        }

    }
    class Class {

        public static void main(String[] args) {

            subclass1 s1 = new subclass1();

            s1.message();

            subclass2 s2 = new subclass2();

            s2.message();

        }

    }

