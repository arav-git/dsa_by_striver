package com.basic.concept;

import java.util.Scanner;

/*
You are given an integer n. You need to return the number of odd digits present in the number.
The number will have no leading zeroes, except when the number is 0 itself.
Input: n = 5
Output: 1
Explanation: 5 is an odd digit.

Input: n = 25
Output: 1
Explanation: The only odd digit in 25 is 5.
 */
public class CountOddDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = countOddDigit(n);
        System.out.println("Count is " + count);
    }

    public static int countOddDigit(int n) {
        if( n == 0) return 1;

        int number = 0;
        int count = 0;
        while(n > 0){
            number = n % 10;
            if(number %2 != 0 ){
                count++;
            }
            n = n/10;
        }
        System.out.println("Count in CountOddDIgit is " + count);
        return count;
    }
}
