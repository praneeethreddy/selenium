package org.example;

public class OperatorsTraining {
    public static void main(String[] args) {
//        Arithmetic Operators + - * / 
        int c = 110;
        int d = 12;

        System.out.println("Add : + " +(c+ d));
        System.out.println("Sub : - "+ (c- d) );
        System.out.println("Mul : * "+ (c* d) );
        System.out.println("Div : /  : it gives the quotient "+ (c/d) );
        double ff = (130.0/22.0);
        System.out.println(ff);

        System.out.println("Modules : % : it gives the reminder "+ (c% d) );
//      Relational Operators ==  != > < >= <=

        System.out.println("equal operator :" + (c==d) );
        System.out.println("Not Equals Operator :" + (c!=d));
        System.out.println("Greater than "+(c>d) +" And Greater Than equal to "+ (c>=d));
        System.out.println("Less than "+(c<d) +" And Less Than equal to "+ (c<=d));
//        Logical Operators && || !
        if(c>10 && d<c){
            System.out.println("Both are True so I executed");
        }
        else {
            System.out.println("Any one is wrong I will execute");
        }
        System.out.println(c>10 || d>c); // Or operator any one is true it is executed

        System.out.println(c!= 110);
//      Assignment operator
        int f=100;
        System.out.println("The f value is assigned with value "+f);
        f += 1;
        System.out.println("Now the f xvalue is compound assigned"+f);
        f -= 1;
        System.out.println(f);
        f *= 10;
        System.out.println(f);
        f /= 100;
        System.out.println(f);









    }
}
