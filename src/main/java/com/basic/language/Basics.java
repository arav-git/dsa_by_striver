package com.basic.language;

import java.util.Scanner;
import java.util.Arrays;
public class Basics {
    public static void main(String[] args){
        System.out.println("Hello World Arav");
        int num1 = 6;
        int num2 = num1++;
        System.out.println("num1 is:  " + num1);
        System.out.println("num2 is:  " + num2);

        String name ="Arav Malik";
        System.out.println(name.substring(0,4));

        int[] arr = {1,2,3};
        int[][] arr1 = {{6,5}, {7,8,9}, {7,4,3}, {8}};

        int a[] = new int[5];
        a[0] = 5;
        a[1] = 6;
        System.out.println(Arrays.toString(a));

        for(int i: a){
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Number is " + number);
        if(number > 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Teen");
        }
        System.out.println(number> 18 ? "Adult" : "Teen");
    }
}