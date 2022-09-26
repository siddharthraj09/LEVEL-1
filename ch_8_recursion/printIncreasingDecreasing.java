package ch_8_recursion;

import java.util.Scanner;

public class printIncreasingDecreasing {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        // Base Case
        if(n == 0) return;
        
        // 1st statement 
        System.out.println(n);
        
        // 2nd statement -> Faith
        pdi(n-1);
        
        // 3rd statement
        System.out.println(n);
    }

}
