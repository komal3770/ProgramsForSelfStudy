package programs.praticals;

public class LongDataTypeTest {
  static char s;

  public static void main(String[] args) {

    long longWithL = 1000 * 60 * 60 * 24 * 365L;
    long longWithoutL = 1000 * 60 * 60 * 24 * 365;
    System.out.println(longWithL);
    System.out.println(longWithoutL);

    System.out.println(LongDataTypeTest.s);
  }
}
