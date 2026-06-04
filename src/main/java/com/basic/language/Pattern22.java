package com.basic.language;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 2 * n - 1; i++) {

            // Loop through all columns of the pattern
            for (int j = 0; j < 2 * n - 1; j++) {

                // Distance of current cell from all four boundaries
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;

                // The minimum distance from any boundary gives the layer number
                int value = n - Math.min(Math.min(top, bottom), Math.min(left, right));

                // Print the current value
                System.out.print(value);
                if (j < 2 * n - 2) System.out.print(" ");
            }

            // Move to the next row
            System.out.println();
        }

        sc.close();
    }
}
