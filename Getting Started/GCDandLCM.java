// 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
// 2. Take as input n and k.
// 3. Print the rotated number.
// 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//    n = 12340056
//    k = 3
//    r = 05612340
// Input Format
// "n" where n is any integer.
// "K" where k is any integer.
// Output Format
// "r", the rotated number
// Sample Input
// 36
// 24
// Sample Output
// 12
// 72

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int on1 = num1;
        int on2 = num2;
        while (num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        int gcd = num2;
        int lcm = (on1 * on2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
