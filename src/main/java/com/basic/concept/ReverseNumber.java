package com.basic.concept;

import java.util.Scanner;

/*
You are given an integer n. Return the integer formed by placing the digits of n in reverse order.
Example 1
Input: n = 25
Output: 52
Explanation: Reverse of 25 is 52.
Example 2
Input: n = 123
Output: 321
Explanation: Reverse of 123 is 321.
 */
public class ReverseNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverseNumber = printReverseNumber(n);
        System.out.println("Reverse Number is " + reverseNumber);
    }

    private static int printReverseNumber(int n) {
        int reverseNumber = 0;
        while(n > 0){
            int lastNumber = n % 10;
            System.out.println("lastNumber " + lastNumber);
            reverseNumber = reverseNumber*10 + lastNumber;
            System.out.println("reverseNumber " + reverseNumber);
            n = n/10;
            System.out.println("n value " + n);

        }
        return reverseNumber;
    }
}
