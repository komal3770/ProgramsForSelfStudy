package string;

public class TestIncrDecrOperator {

  public static void main(String[] args) {
    String s1 = "aaa";
    System.out.println("s1 " + s1.hashCode());
    String s2 = new String("aaa");
    System.out.println("s2 " + s2.intern() + " - " + (s1 == s2));

    String s3 = "aaa";

    System.out.println("s3 " + s3.hashCode());
  }
}
