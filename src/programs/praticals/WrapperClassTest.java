package programs.praticals;

public class WrapperClassTest {

  public static void main(String[] args) {
    Integer i1 = new Integer(127);
    Integer i2 = new Integer(127);
    System.out.println("i1=" + i1 + " , i2=" + i2);
    System.out.println(i1 == i2); // false - creates new references

    Integer i3 = 127;
    Integer i4 = 127;

    System.out.println(i3 == i4); // true - used cached references

    Integer i5 = Integer.valueOf(127);
    Integer i6 = Integer.valueOf(127);

    System.out.println(i5 == i6); // true - used cached references
  }
}
