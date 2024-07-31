package programs.praticals;

import java.util.HashSet;
import java.util.Set;

public class HashCodeTest {

  public static void main(String[] args) {
    Set<Test> testList = new HashSet<>();
    testList.add(new Test("A", "ABC"));
    testList.add(new Test("B", "BBBBC"));
    testList.add(new Test("C", "CCCBC"));
    testList.add(new Test("A", "ABC"));

    testList.add(new Test(null, "ABC"));
    testList.add(new Test("D", "ABC"));
    testList.add(new Test(null, "ABC"));
    testList.add(new Test(null, "ABC"));
    testList.add(new Test("F", "ABC"));
    testList.add(new Test("G", "ABC"));
    testList.add(new Test(null, "ABC"));
    testList.add(new Test(null, "ABC"));

    System.out.println(testList);
  }
}

class Test {
  private String a;
  private String b;

  public Test(String a, String b) {
    this.a = a;
    this.b = b;
  }

  public String getA() {
    return a;
  }

  public void setA(String a) {
    this.a = a;
  }

  public String getB() {
    return b;
  }

  public void setB(String b) {
    this.b = b;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((a == null) ? 0 : a.hashCode());
    result = prime * result + ((b == null) ? 0 : b.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj.getClass() != this.getClass()) return false;
    Test test = (Test) obj;

    return (a == null && test.a == null) || test.a.equals(a);
  }

  @Override
  public String toString() {
    return "Test [a=" + a + ", b=" + b + "]";
  }
}
