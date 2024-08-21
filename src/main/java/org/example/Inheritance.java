package org.example;

public class Inheritance {
    public static void main(String[] args) {

        Inheritance in =new Inheritance();
//        in.mymethod();
        Child c = new Child();
        c.mymethod();
    }
    public void mymethod(){
        System.out.println("Helo");
    }
}
class Child extends Inheritance{
    @Override
    public void mymethod(){
        System.out.println("Praneeth");
    }
}
