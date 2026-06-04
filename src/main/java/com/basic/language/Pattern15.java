package com.basic.language;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1;i <= n; i++ ){
            int sum =65;
            for(int j = 1; j <= n-i +1; j++){
                System.out.print((char)sum++);
                // if(i != j)
                //     System.out.print(" ");
            }

            System.out.println();
        }
        sc.close();
        char ch = 'A';
        System.out.println(ch +1 );
    }
}
