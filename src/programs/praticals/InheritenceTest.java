package programs.praticals;

class Test1 {}

class TestA extends Test1 {}

class TestB extends TestA {}

class TestC extends Test1 {}

class TestD extends TestC {}

public class InheritenceTest {

  public static void main(String[] args) {
    Test1 t1 = new Test1();

    Boolean res = t1 instanceof TestB;
    System.out.println("res " + res);

    TestB t2 = (TestB) t1;

    t1 = new TestD();
    if (t1 instanceof TestC) {
      TestC t3 = (TestC) t1;
    }
  }
}
