package com.harman;
class hello {
        String name="Nithin";
        String age="21";
        void does(){
            System.out.println("my details");
        }
    }
    public class year extends hello{
        String year="2000";
        public static void main(String[] args) {
            year ob=new year();
            System.out.println(ob.name);
            System.out.println(ob.age);
            System.out.println(ob.year);
            ob.does();
        }
    }

