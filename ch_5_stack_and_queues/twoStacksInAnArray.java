
// https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/two-stacks-official/ojquestion
package ch_5_stack_and_queues;
import java.io.*;
import java.util.*;
public class twoStacksInAnArray {


    public static class TwoStack {

        int[] data;
        int top1, top2, size1, size2;
        public  TwoStack(int cap) {
          data = new int[cap];
          top1 = -1;
          top2 = cap;
          size1 = size2 = 0;
    
        }
        int size1() {
          return size1;
        }
    
        int size2() {
          return size2;
        }
    
        void push1(int val) {
          if (size1 + size2 == data.length) {
            System.out.println("Stack overflow");
            return;
          }
    
          top1++;
          size1++;
          data[top1] = val;
        }
    
        void push2(int val) {
          if (size1 + size2 == data.length) {
            System.out.println("Stack overflow");
            return;
          }
    
          top2--;
          size2++;
          data[top2] = val;
        }
    
        int pop1() {
          if (top1 == -1) {
            System.out.println("Stack underflow");
            return -1;
          }
    
          int val = data[top1];
          top1--;
          size1--;
          return val;
        }
    
        int pop2() {
          if (top2 == data.length) {
            System.out.println("Stack underflow");
            return -1;
          }
    
          int val = data[top2];
          top2++;
          size2--;
          return val;
        }
    
        int top1() {
          if (top1 == -1) {
            System.out.println("Stack underflow");
            return -1;
          }
    
          return data[top1];
        }
    
        int top2() {
          if (top2 == data.length) {
            System.out.println("Stack underflow");
            return -1;
          }
    
          return data[top2];
        }
      }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    TwoStack st = new TwoStack(n);

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push1")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push1(val);
      } else if (str.startsWith("pop1")) {
        int val = st.pop1();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top1")) {
        int val = st.top1();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size1")) {
        System.out.println(st.size1());
      } else if (str.startsWith("push2")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push2(val);
      } else if (str.startsWith("pop2")) {
        int val = st.pop2();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top2")) {
        int val = st.top2();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size2")) {
        System.out.println(st.size2());
      }
      str = br.readLine();
    }
  }
}
