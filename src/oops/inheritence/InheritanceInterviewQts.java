package oops.inheritence;

/*
 * Guess the output of the below and find out how it prints
 * */
class ParentCls {
  int i = 10;

  ParentCls() {
    System.out.println("AA constructor");
  }

  void display() {
    System.out.println("AA display");
  }
}

class ChildCls extends ParentCls {

  int i = 20;

  ChildCls() {
    // super();
    this("a");
  }

  ChildCls(String s) {
    System.out.println("s " + s);
  }

  public void display() {
    System.out.println("BB");
  }
}

public class InheritanceInterviewQts {
  public static void main(String[] args) {
    ChildCls a = new ChildCls();
    System.out.println(a.i);
    a.display();
  }
}
