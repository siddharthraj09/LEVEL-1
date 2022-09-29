// 1. You are given a number x.
// 2. You are given another number n.
// 3. You are required to calculate x raised to the power n. Don't change the signature of power function .

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
package ch_8_recursion;

import java.util.Scanner;

public class powerLinear {
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x=scn.nextInt();
        int n = scn.nextInt();
        int ans = linear(x,n);
        System.out.print(ans);

    }
    public static int linear(int x,int n ){
        if(n==0){
            return 1;

        }
        int pow=linear(x,n-1);
        int ans= x*pow;
        return ans;
    }
}
