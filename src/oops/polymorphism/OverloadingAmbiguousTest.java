package oops.polymorphism;

/*
 * If you have two overloaded constructors, one accepting an Object
 * and the other accepting a String as parameters,
 * and you try to call one of these constructors with a null value.
 * Check the below program.
 * */
public class OverloadingAmbiguousTest {

  public OverloadingAmbiguousTest(Object o) {
    System.out.println("Object Constructor");
  }

  public OverloadingAmbiguousTest(String s) {
    System.out.println("String Constructor");
  }

  public void test(String s) {
    System.out.println("String method");
  }

  public void test(Object s) {
    System.out.println("Object method");
  }

  public static void main(String[] args) {
    OverloadingAmbiguousTest a = new OverloadingAmbiguousTest(null);//Try it
    a.test(null);
  }
}
