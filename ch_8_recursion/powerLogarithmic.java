package ch_8_recursion;

import java.util.Scanner;

public class powerLogarithmic {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = logrithmic(x, n);
        System.out.print(ans);

    }

    public static int logrithmic(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int pow = logrithmic(x, n / 2);
        int ans = pow * pow;

        if (n % 2 == 1) {
            ans = x * ans;
        }

        return ans;

    }
}
