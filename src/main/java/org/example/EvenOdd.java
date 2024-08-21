package org.example;

public class EvenOdd {
    public static void main(String[] args) {
//        for(int i=1;i<=100;i++){
//            if(i%2==0){
//                System.out.println(i+" : Is even number");
//            }
//            else{
//                System.out.println(i+" : Is odd number");
//
//            }
//        }
        for(int i=6;i<100;i++){
            if(i%2!=0 && i%3!=0 && i%5!=0){
                System.out.println(i +" :Is a prime number");
            }
            else {
                System.out.println(i+" :Not a prime number");
            }
        }

    }
}
