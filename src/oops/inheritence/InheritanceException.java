package oops.inheritence;

import java.io.IOException;

/*
 * https://medium.com/@salvipriya97/java-rules-to-follow-when-using-checked-exceptions-with-inheritance-62cd3a6dfc6c
 * */
class ParentClass {
  public void methodThrowingException() throws Exception {
    System.out.println("Parent");
  }

  public void methodThrowingRuntimeException() throws RuntimeException {
    System.out.println("Parent");
  }

  public void methodThrowingCompileTimeException() throws IOException {
    System.out.println("Parent");
    throw new IOException("");
  }
}

class ChildClass extends ParentClass {
  @Override
  public void methodThrowingException() {
    System.out.println("Child");
  }

  @Override
  public void methodThrowingRuntimeException() {
    System.out.println("Child");
  }

  @Override
  public void
      methodThrowingCompileTimeException() /*throws SQLException*/ /*throws FileNotFoundException */ {
    System.out.println("Child");
  }
}

public class InheritanceException {

  public static void main(String[] args) {
    ChildClass child = new ChildClass();
    child.methodThrowingCompileTimeException();
  }
}
