package com.basic.language;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =65;
        char ch = 'A';
        for(int i = 1;i <= n; i++ ){
            ch = (char) ('A' + i - 1);
            for(int j = 1; j <= i; j++){
                System.out.print((char)ch);
                // if(i != j)
                //     System.out.print(" ");
            }
            sum++;

            System.out.println();
        }
        sc.close();
    }
}
