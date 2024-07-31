package string;

public class StringObjects {

  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = s1;
    System.out.println("s1 " + s1.hashCode());
    System.out.println("s2 " + s2.hashCode());
    System.out.println(s1 == s2); // true
    System.out.println(s1.equals(s2)); // true

    String s3 = new String("pqr");
    String s4 = new String(s3);

    System.out.println("s3 " + s3.hashCode());
    System.out.println("s4 " + s4.hashCode());

    System.out.println(s3 == s4); // false
    System.out.println(s3.equals(s4)); // true
  }
}
