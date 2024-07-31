package exceptions;

class Parent1 {
  public void display() throws NullPointerException {
    System.out.println("Parent");
  }
}

class Child1 extends Parent1 {
  @Override
  public void display() throws ArithmeticException {
    System.out.println("Child");
  }
}

public class TestOverriding {

  public static void main(String[] args) {
    Parent1 p = new Child1();
    try {
      p.display();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
