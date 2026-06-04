package com.basic.language;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Starts
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n-1; i++) {
            for (int j = n -1 - i + 1; j > 0; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = n-1 - i + 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
