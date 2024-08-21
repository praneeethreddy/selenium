package org.example;
public class AbstractClassPractice extends MyAbstract{
    @Override
    public void myabstractmethod() {}
    public static void main(String[] args) {

        MyAbstract myAAbstract = new MyAbstract() {
            @Override
            public void myabstractmethod() {
                System.out.println("I am inherited from the abstract class");

            }
        };
        myAAbstract.myabstractmethod();
        myAAbstract.mymethod();

    }



}
abstract class MyAbstract{
    abstract void myabstractmethod();

    public void mymethod(){
        System.out.println("I am normal method from abstract class");
    }

}