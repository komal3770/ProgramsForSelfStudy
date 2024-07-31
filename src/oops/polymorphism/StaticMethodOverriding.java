package oops.polymorphism;

/** Concept is method hiding */
class ParentStatic {
  public static void test() {
    System.out.println("Parent");
  }
}

class ChildStatic extends ParentStatic {
  public static void test() {
    System.out.println("Child");
  }
}

public class StaticMethodOverriding {

  public static void main(String[] args) {
    ParentStatic p = new ChildStatic();
    p.test();
  }
}
