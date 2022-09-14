package ch_4_arrays;

import java.util.Scanner;

public class findElementInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= scn.nextInt();                
        }
        int x=scn.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                System.out.println(i);
                break;
            }
        }
    }
}
