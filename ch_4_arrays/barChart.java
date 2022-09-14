// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print a bar chart representing value of arr a.
// Input Format
// A number n
// n1
// n2
// .. n number of elements
// Output Format
// A bar chart of asteriks representing value of array a
package ch_4_arrays;

import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scn.nextInt();                
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        int height =max;
        for (int i = 0; i < max; i++) {
            
            for (int j = 0; j < arr.length; j++) {
                if(height <= arr[j]){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
                
            }
            height--;
            System.out.println();
        }
    }
}
