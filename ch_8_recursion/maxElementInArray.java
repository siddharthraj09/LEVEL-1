package ch_8_recursion;

import java.util.Scanner;

public class maxElementInArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = maxOfArray(arr, 0);
        System.out.print(ans);

    }

    public static int maxOfArray(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int msid = maxOfArray(arr, idx + 1);
        if (msid > arr[idx]) {
            return msid;
        } else {
            return arr[idx];
        }
    }

}
