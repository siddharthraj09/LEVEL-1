package ch_4_arrays;

import java.util.Scanner;

public class differenceof2arrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }
        int[] sum = new int[n1 > n2 ? n1 : n2];
        int c = 0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int d = c;
            if (i >= 0) {
                d = d + a1[i];
            }
            if (j >= 0) {
                d = d - a2[j];
            }
            if(d < 0 ){
                c=-1;
                d=d+10;
            }
            else{
                c=0;
            }
            // c = d / 10;
            // d = d % 10;
            sum[k] = d;
            k--;
            i--;
            j--;
        }
        if (c != 0) {
            System.out.println(c);
        }
        for (int val : sum) {
            System.out.println(val);
        }
    }
}
