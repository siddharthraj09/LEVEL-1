package ch_8_recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = factorial(n);
        System.out.print(ans);

    }

    public static int factorial(int n) {
        // Base Case
        if (n == 1)
            return 1;

        int fact = factorial(n - 1);
        int fnm = n * fact;
        return fnm;

    }
}
