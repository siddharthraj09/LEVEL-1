package ch_3_Functions;

import java.util.Scanner;

public class anybase2anybase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int dn = getValueInDecimalBase(n, b1);
        int dn2 = getValueInanyBase(dn, b2);
        System.out.println(dn2);
    }

    public static int getValueInDecimalBase(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            rv = rv + dig * p;
            p = p * b;

        }
        return rv;

    }

    public static int getValueInanyBase(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % b;
            n = n / b;
            rv = rv + dig * p;
            p = p * 10;

        }
        return rv;

    }
}
