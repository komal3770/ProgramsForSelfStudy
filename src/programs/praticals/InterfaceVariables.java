package programs.praticals;

/**
 * Class declaring same variables as that of an Interface. The method implementing in class will use
 * values from class not from interface.
 */
interface MyInterface {
  public float b = 10;
  public float c = 3;

  public float calculateSalary();
}

public class InterfaceVariables implements MyInterface {
  float b = 100;
  float c = 5;

  public static void main(String[] args) {
    MyInterface impl = new InterfaceVariables();
    System.out.println(impl.calculateSalary());
  }

  @Override
  public float calculateSalary() {
    return b / c;
  }
}
