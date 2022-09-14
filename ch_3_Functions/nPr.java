package ch_3_Functions;

import java.util.Scanner;

public class nPr {

    public static int calc(int n, int r) {
        int fact = 1;
        for (int i = 1; i <= n - r; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int nfact = calc(n, 0);
        int nmrfact = calc(n, r);
        int npr = nfact / nmrfact;
        System.out.println(n + "P" + r + "=" + npr);
    }

  
}
