// https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/min-stack-ii-official/ojquestion
package ch_5_stack_and_queues;

import java.util.*;
import java.io.*;

public class minimumStackConstantSpace {
    
  public static class MinStack {
    Stack<Integer> data;
    int min;

    public MinStack() {
      data = new Stack<>();
    }

    int size() {
      return data.size();
      // write your code here
    }

    void push(int val) {
      if (data.size() == 0) {
        data.push(val);
        min = val;

      }
      else if (val >= min) {
        data.push(val);
      }
      else{
          data.push(2*val -min);//detection ,storing small fake value
          min =val;//orig value stored in min
      }

    }
    // write your code here

  int pop() {
       if (size() == 0) {
      System.out.println("Stack underflow");
      return -1;
    }
    else {
        if(data.peek() >=min){
            
            return data.pop();
        }
        else{
            int ov = min;
            min = 2*min - data.pop();
            return ov ;
        }
      
    }
    // write your code here
  }

  int top() {
    if (size() == 0) {
      System.out.println("Stack underflow");
      return -1;
    }
    else {
        if(data.peek() >=min){
            return data.peek();
        }
        else{
            return min;    
        }
      
    }
  }


  int min() {
    if (size() == 0) {
      System.out.println("Stack underflow");
      return -1;
    }
    else {
      return min;
    }
  }
}

public static void main(String[] args) throws Exception {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  MinStack st = new MinStack();

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
    } else if (str.startsWith("min")) {
      int val = st.min();
      if (val != -1) {
        System.out.println(val);
      }
    }
    str = br.readLine();
  }
}
}
