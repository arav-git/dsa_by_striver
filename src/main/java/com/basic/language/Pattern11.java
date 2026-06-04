package com.basic.language;

import java.util.Scanner;

public class Pattern11 {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*for(int i =1; i <= n; i++){
            for(int j = 1; j <=i; j++){
                if( (i+j) % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }*/

        for(int i =1; i <= n; i++){
            int start = 0;
            if( i % 2 == 0)
                start  = 1;
            else
                start = 0;
            for(int j = 1; j <=i; j++){
                System.out.print(start);
                if (j != i) System.out.print(" ");
               start = 1- start;
            }
            System.out.println();
        }
        
        sc.close();
    }
}
