package oops.inheritence;

class AAA {

  AAA() {
    System.out.println("AAA Default");
  }

  AAA(String s) {
    System.out.println("AAA " + s);
  }

  static void test() {
    System.out.println("parent");
  }
}

class BBB extends ParentClass {

  BBB() {
    System.out.println("BBB Dfault");
  }

  BBB(String s) {
    // super(s);
    System.out.println("BBB " + s);
  }

  static void test() {
    System.out.println("child");
  }
}

public class InstanceOfTestInInheritance {
  public static void main(String[] args) {
    ParentClass b = new BBB("BBB");
    BBB b2 = new BBB("BBB");
    ParentClass b3 = new BBB();
    System.out.println(b instanceof ParentClass);
    System.out.println(b instanceof BBB);
  }
}
