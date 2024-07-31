package oops.polymorphism;

/*
 * Demonstrate default method to check if diamond problem come or not in the below case
 * */
interface O {
  private void m1() {
    System.out.println("O interface");
  }
}

interface M {
  default void m1() {
    System.out.println("M interface");
  }
}

class OM implements O, M {

  @Override
  public void m1() {
    M.super.m1();
  }
}

public class InterfaceDefaultMethod {

  public static void main(String[] args) {}
}
