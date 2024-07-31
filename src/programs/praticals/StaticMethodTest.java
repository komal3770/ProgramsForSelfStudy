package programs.praticals;

public class StaticMethodTest {
  static int staticVar;
  int instanceVar;

  static void myStaticMethod() {
    System.out.println(staticVar);
    // System.out.println(instanceVar);
  }

  public static void main(String[] args) {
    new StaticMethodTest().myInstanceMethod();
  }

  void myInstanceMethod() {
    System.out.println(staticVar);
  }
}
