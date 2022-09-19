// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing the height of bars in a bar chart.
// 3. You are required to find and print the area of largest rectangle in the histogram.

// e.g.
// for the array [6 2 5 4 5 1 6] -> 12
package ch_5_stack_and_queues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class largestAreaOfHistogram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
        //right side index 
        int [] rb =new int[a.length];
        Stack <Integer> st = new Stack<>();
        st.push(a.length-1);
        rb[a.length -1] = a.length;
        for (int i = a.length-2; i >=0; i--) {
            while(st.size() >0 && a[i] < a[st.peek()]){
                st.pop();
            }
            if(st.size() ==0){
                rb[i]=a.length;
            }
            else{
                rb[i] = st.peek();
            }
            st.push(i);
        }



        int [] lb =new int[a.length];
        st = new Stack<>();
        st.push(0);
        lb[0] = -1;
        for (int i =1; i <a.length; i++) {
            while(st.size() >0 && a[i] < a[st.peek()]){
                st.pop();
            }
            if(st.size() ==0){
                lb[i]=-1;
            }
            else{
                lb[i] = st.peek();
            }
            st.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < a.length; i++) {
            int width = rb[i]-lb[i]-1;
            int area = a[i] *width;
            if(area > maxArea){
                maxArea=area;
            }
            
        }
        System.out.println(maxArea);
    }
}
