package programs.praticals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreadSafe {

  public static void main(String[] args) {
    Set<String> st = new HashSet<>();
    List<String> lt = new ArrayList<String>(st);
  }
}

class A {
  private String s;

  A(String s) {
    this.s = s;
  }

  public static void removeStr(List<A> lst) {
    for (int i = 0; i < lst.size(); i++) {
      A a = lst.get(i);
      if (i % 2 == 0) {
        lst.remove(a);
      }
    }
  }

  public String getS() {
    return s;
  }

  public void setS(String s) {
    this.s = s;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "[s=" + this.s + "]";
  }
}
