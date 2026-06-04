package com.basic.language;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i <= n; i++ ){
            for(int j = n-i; j >0; j--){
                System.out.print(" ");
            }
            char ch = (char) ('A');
            for(int j = 1; j <= i; j++){
                System.out.print((char)(ch + j -1)) ;
            }
            // decreasing characters
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) ('A' + j - 1));
            }

            for(int j = n-i; j >0; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
