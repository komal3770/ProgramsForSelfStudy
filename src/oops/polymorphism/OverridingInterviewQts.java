package oops.polymorphism;

/** Inheritance when methods are overridden & Parent class reference type is used */
class ParentCls {
  public void m1() {
    System.out.println("Parent m1");
    this.m2();
  }

  public void m2() {
    System.out.println("Parent m2");
  }
}

class ChildCls extends ParentCls {
  @Override
  public void m2() {
    System.out.println("Child m2");
  }

  public void m3() {
    System.out.println("Child m3");
  }
}

public class OverridingInterviewQts {

  public static void main(String[] args) {
    // Parent is reference type & Child is the object type for the below object 'obj'
    ParentCls obj = new ChildCls();
    obj.m1();
    obj.m2();
    // Uncomment below line and see what happens
    // parent.m3();
  }
}
