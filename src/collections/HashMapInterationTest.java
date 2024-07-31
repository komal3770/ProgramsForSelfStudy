package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapInterationTest {

  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("A", 1);
    map.put("B", 2);
    for (String k : map.keySet()) {
      System.out.println(k);
      map.put("C", 3); // java.util.ConcurrentModificationException
    }
  }
}
