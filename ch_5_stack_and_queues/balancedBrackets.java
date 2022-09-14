// You are given a string exp representing an expression.
// 2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

// e.g.
// [(a + b) + {(c + d) * (e / f)}] -> true
// [(a + b) + {(c + d) * (e / f)]} -> false
// [(a + b) + {(c + d) * (e / f)} -> false
// ([(a + b) + {(c + d) * (e / f)}] -> false
// Input Format
// A string str
// Output Format
// true or false

package ch_5_stack_and_queues;

import java.util.Scanner;
import java.util.Stack;

import javax.xml.validation.Schema;

public class balancedBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }

            else if (ch == ')') {
                boolean val = handleClosing(st, '(');
                if (val == false) {
                    System.out.println(val);
                    return;
                }

            } else if (ch == ']') {
                boolean val = handleClosing(st, '[');
                if (val == false) {
                    System.out.println(val);
                    return;
                }

            } else if (ch == '}') {
                boolean val = handleClosing(st, '{');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else {

            }
        }
        if (st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean handleClosing(Stack<Character> st, char corresponCh) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != corresponCh) {

            return false;
        } else {
            st.pop();
            return true;
        }
    }
}
