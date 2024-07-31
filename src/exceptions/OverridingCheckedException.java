package exceptions;

import java.io.IOException;

/**
 * If child-class throws Exception & parent-class throws IOException
 *
 * <p>We cannot narrow the scope
 */
class SuperClass {
  public void demo() throws IOException {}
}

class SubClass extends SuperClass {
  public void demo() // throws Exception
      {}
}

public class OverridingCheckedException {

  public static void main(String[] args) {}
}
