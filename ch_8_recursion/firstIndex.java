package ch_8_recursion;

import java.util.Scanner;

public class firstIndex {
    // public static void main(String[] args) throws Exception {
    //     // write your code here
    //     Scanner scn = new Scanner(System.in);
    //     int n = scn.nextInt();
    //     int[] arr = new int[n];

    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = scn.nextInt();
    //     }
    //     System.out.println("Enter number to be found");
    //     int x = scn.nextInt();
    //     int ans = firstIndex(arr, x, arr.length - 1);
    //     System.out.print(ans);

    // }

    // public static int firstIndex(int[] arr, int x, int idx) {
    //     if (idx < 0) {
    //         return -1;
    //     }
    //     int msid = firstIndex(arr, x, idx - 1);
    //     if (arr[idx] == x) {
    //         return idx;

    //     } else {
    //         return msid;
    //     }
    // }

    public static void main(String[] args) throws Exception {
        // write your code here
            Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
    
        for (int i = 0; i < arr.length; i++) {
        arr[i] = scn.nextInt();
        }
        // System.out.println("Enter number to be found");
        int x = scn.nextInt();
        int ans = firstIndex(arr, 0, x);
        System.out.print(ans);
    
      }
    
      public static int firstIndex(int[] arr, int idx, int x) {
        if (idx == arr.length ) {
          return -1;
        }
        if (arr[idx] == x) {
          return idx;
    
        } else {
          int msid = firstIndex(arr, idx + 1,x);
          return msid;
        }
    
      }
}
