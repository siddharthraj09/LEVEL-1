// 1. You are given a string exp representing an expression.
// 2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
// 3. But, some of the pair of brackets maybe extra/needless. 
// 4. You are required to print true if you detect extra brackets and false otherwise.

// e.g.'
// ((a + b) + (c + d)) -> false
// (a + b) + ((c + d)) -> true
// Input Format
// A string str
// Output Format
// true or false
// (a + b) + ((c + d))
// true

package ch_5_stack_and_queues;

import java.util.Scanner;
import java.util.Stack;

public class duplicateBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> st = new Stack<>();

        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            if (ch == ')') {
                if(st.peek() == '('){
                    System.out.println(true);
                    return;
                }
                else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
           

        }
        System.out.println(false);
    }

}
