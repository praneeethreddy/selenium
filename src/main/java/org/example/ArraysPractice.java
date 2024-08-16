package org.example;

import java.util.Arrays;

public class ArraysPractice {
    public static <fruit> void main(String[] args) {
//        Array declaration
        int []a =new int [5];
        a = new int[]{1, 3, 4, 5};

        String [] fruits ={"Orange","grapes", "banana"};
//        fruits[3]="apple";   it will not take the extra size elements it can replace the existing element with the new element
        System.out.println(Arrays.toString(fruits));

        for(int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }
//        Enhanced for loop
        System.out.println("Enhanced for loop");
        for(String fruit :fruits){
            System.out.println(fruit);
        }
        System.out.println("While loop");
        int i=0;
        while(i<a.length){
            System.out.println(a[i]);
            i++;
        }
        System.out.println("Do While loop");

        int j=0;
        do {
            System.out.println(a[j]);
            j++;
        }while (j<a.length);


    }
}
