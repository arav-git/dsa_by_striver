package com.basic.language;

import java.util.Scanner;

public class Pattern9 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i =1; i <= n; i++){
            for(int k = 0; k < n-i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i -1; j++){
                System.out.print("*");
            } 
            for(int k = 0; k <  n-i; k++){
               System.out.print(" ");
             }
            System.out.println();
        }
        
        for (int i =1; i <= n; i++){
            for(int j = 0; j <  i-1; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*n-1 - 2*(i- 1); j++){
                System.out.print("*");
            } 
            for(int j = 0; j <  i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}


// *********  == Space (0), Stars 9, Space 0
//  *******    = Space 1, Star 7, Space 1
//   *****    = Space 2, Star 5, Space 2
//    ***     = Space 3, Star 3, Space 3
//     *      = Space 4, Star 1, Space 4