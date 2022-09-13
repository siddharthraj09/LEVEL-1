// Count Digits In A Number
// 1. You've to count the number of digits in a number.
// 2. Take as input "n", the number for which the digits has to be counted.
// 3. Print the digits in that number.
// Input Format
// "n" where n is any integer.
// Output Format
// "d" where d is the number of digits in the number "n"

import java.util.Scanner;

public class NoOfDigitsInNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int count = 0;
        while(n > 0 ){
            // int rem=n % 10;
            n/=10;
            count ++;
        }
        System.out.println(count);
    }
}
