package exceptions;

public class FinallyWithExceptionThrowm {

  public static void main(String[] args) {
    try {
      System.out.println("In Sysout " + FinallyWithExceptionThrowm.test());
    } catch (Exception e) {
      System.out.println("In catch");
    }
    System.out.println("Here");
  }

  @SuppressWarnings("finally")
  public static int test() {
    try {
      System.out.println("In try");
      throw new Exception();
    } catch (Exception e) {
      System.out.println("In catch");
      return 2;
    } finally {
      System.out.println("In finally");
      return 3;
    }
    // Unreachable code here
    // System.out.println("Outside");
  }
}
