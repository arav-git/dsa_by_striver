package com.basic.concept;

import java.util.Scanner;

/*You are given an integer n. You need to return the number of digits in the number.
Input: n = 4
Output: 1
Explanation: There is only 1 digit in 4.*/
public class CountDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = countDigit(n);
        System.out.println("Count is " + count);
    }

    /*public static int countDigit(int n) {
        String nString = n + "";
        return nString.length();
    }*/

    public static int countDigit(int n) {
        int count = 0;
        while(n > 0){
            n = n/10;
            count++;
        }
        System.out.println("Count in CountDIgit is " + count);
        return count;
    }

}