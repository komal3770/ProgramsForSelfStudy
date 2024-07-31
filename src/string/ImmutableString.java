package string;

/** Demonstrating String is immutable, so hashcode is same if assign same object to another */
public class ImmutableString {
  public static void main(String[] args) {
    // String Literals
    String a = "ABC";
    String b = "DEF";
    System.out.println("a " + a.hashCode());
    System.out.println("b " + b.hashCode());
    b = a;
    System.out.println("b(after) " + b.hashCode());
    String c = "DEF";
    System.out.println("c " + c.hashCode());
    System.out.println("*********************************************");
    // String new
    String s1 = new String("PQR");
    String s2 = new String("XYZ");
    String s3 = new String(s1);
    String s4 = s2;
    System.out.println("s1 = " + s1.hashCode());
    System.out.println("s2 = " + s2.hashCode());
    System.out.println("s3 = " + s3.hashCode());
    System.out.println("s4 = " + s4.hashCode());
    System.out.println("s1==s3 : " + (s1 == s3));
    System.out.println("s2==s4 : " + (s2 == s4));
  }
}
