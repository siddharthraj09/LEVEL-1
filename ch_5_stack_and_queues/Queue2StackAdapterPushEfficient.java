// https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/queue-to-stack-adapter-push-efficient-official/ojquestion
package ch_5_stack_and_queues;

import java.io.*;
import java.util.*;
public class Queue2StackAdapterPushEfficient {
    public static class QueueToStackAdapter {
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;
    
        public QueueToStackAdapter() {
          mainQ = new ArrayDeque<>();
          helperQ = new ArrayDeque<>();
        }
    
        int size() {
          return mainQ.size();
          // write your code here
        }
    
        void push(int val) {
          mainQ.add(val);
          // write your code here
        }
    
        int pop() {
          if (size() == 0 ) {
            System.out.println("Stack underflow");
            return -1;
          } else {
            while (mainQ.size() > 1) {
              helperQ.add(mainQ.remove());
            }
            int val = mainQ.remove();
            while (helperQ.size() > 0) {
              mainQ.add(helperQ.remove());
            }
            return val;
          }
    
          // write your code here
        }
    
        int top() {
          if (size() == 0 ) {
            System.out.println("Stack underflow");
            return -1;
          } else {
            while (mainQ.size() > 1) {
              helperQ.add(mainQ.remove());
            }
            int val = mainQ.remove();
            helperQ.add(val);
            while (helperQ.size() > 0) {
              mainQ.add(helperQ.remove());
            }
            return val;
          }
          // write your code here
        }
      }
    
      public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        QueueToStackAdapter st = new QueueToStackAdapter();
    
        String str = br.readLine();
        while (str.equals("quit") == false) {
          if (str.startsWith("push")) {
            int val = Integer.parseInt(str.split(" ")[1]);
            st.push(val);
          } else if (str.startsWith("pop")) {
            int val = st.pop();
            if (val != -1) {
              System.out.println(val);
            }
          } else if (str.startsWith("top")) {
            int val = st.top();
            if (val != -1) {
              System.out.println(val);
            }
          } else if (str.startsWith("size")) {
            System.out.println(st.size());
          }
          str = br.readLine();
        }
      }
}
