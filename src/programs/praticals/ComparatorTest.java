package programs.praticals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

  public static void main(String[] args) {
    String[] arr = {"c", "d", "b", "a", "e"};
    InnerClass in = new InnerClass();
    Arrays.parallelSort(arr, in);
    for (String string : arr) {
      System.out.println(string + "");
    }
    System.out.println(Arrays.binarySearch(arr, "b"));

    List lt = new ArrayList();
    lt.add(3);
    lt.add(2);
    lt.add(6);
    lt.add(7);
    lt.remove(2);
    System.out.println(lt);
  }

  static class InnerClass implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
      return s2.compareTo(s1);
    }
  }
}
