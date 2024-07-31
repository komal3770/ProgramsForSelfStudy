package oops.inheritence;

class AA {
  protected String name = "AA";
}

class BB extends AA {
  public void printName() {
    System.out.println(name + " from BB");
  }
}

public class ProtectedAccessModifierTest {

  public static void main(String[] args) {
    new BB().printName();
  }
}
