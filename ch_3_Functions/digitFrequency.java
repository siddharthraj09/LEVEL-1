package ch_3_Functions;

import java.util.Scanner;

public class digitFrequency {
    public static int countDigitFreq(int n, int x) {
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == x) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int digitCount = countDigitFreq(n,x);
        System.out.println(digitCount);
    }
}
