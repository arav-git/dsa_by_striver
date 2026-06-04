package com.basic.language;

import java.util.Scanner;

/*
Patterns Rules:
1.Figure out the number of lines to be printed (Write your outer loop on it)
2.Figure out what is happening at every line (Try to connect with outer loop if possible , Write your inner loop on it)
3.Execute print when needed
4.Observe symmtery
*/
public class Patterns {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                if( j == num)
                    System.out.print("*" );
                else
                    System.out.print("* " );   
            }
            if(i != num)
                System.out.println();
        }
        sc.close();
    }
}
