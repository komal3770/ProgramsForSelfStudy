package programs.praticals;

class AAA {
  public void display() throws Exception {
    System.out.println("Parent");
  }
}

class B extends AAA {
  public void display() {
    System.out.println("Child");
  }
}

public class InheritenceException {

  public static void main(String[] args) {}
}
