package com.basic.language;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i <= n; i++ ){
            char ch = (char)('A' + n-1);
            for(int j = 1; j <=i; j++){
                if( j == i){
                    System.out.print((char) ch);
                }    
                else{
                    System.out.print((char) (char) (ch - i + j) + " ");
                }  
            }
            System.out.println();
        }
        sc.close();
    }
}
