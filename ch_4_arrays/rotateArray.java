package ch_4_arrays;
import java.util.*;
import java.io.*;
public class rotateArray {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + " ");
        }
        System.out.println(sb);
      }
      public static void reverse(int[]arr,int i,int j ){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
      }
    
      public static void rotate(int[] a, int k){
        k = k%a.length;
        if (k<0) {
            k=k+a.length;
        }
        reverse(a, 0, a.length-k-1);
        reverse(a, a.length-k,a.length-1);
        reverse(a, 0, a.length-1);
        // write your code here
      }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());
    
        rotate(a, k);
        display(a);
     }
}
