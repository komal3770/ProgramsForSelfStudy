package oops.inheritence;

interface I1 {
  public void display();
}

interface I2 {
  public void display();
}

class Impl implements I1, I2 {

  @Override
  public void display() {}
}

public class InterfaceWithSameMethodTest {
  public static void main(String[] args) {}
}
