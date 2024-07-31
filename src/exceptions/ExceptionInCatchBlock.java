package exceptions;

public class ExceptionInCatchBlock {
  public static void main(String[] args) {
    System.out.println(new ExceptionInCatchBlock().execute());
  }

  @SuppressWarnings("finally")
  public int execute() {
    int a;
    try {
      a = 1 / 0;
      System.out.println("a=" + a);
      return 1;
    } catch (RuntimeException e) {
      a = 1 / 0;
      System.out.println("Catch");
      return 2;
    } finally {
      System.out.println("Finally");
      return 3;
    }
  }
}
