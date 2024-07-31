package collections;

import java.util.Stack;

public class StackTest {

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<Integer>();
    st.add(12);
    st.push(15);
    System.out.println(st);
    // st.remove(3);
    st.pop();
    System.out.println(st);
  }
}
