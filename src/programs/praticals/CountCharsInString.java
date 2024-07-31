package programs.praticals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Count the characters present in the given string */
public class CountCharsInString {
  static final int MAX_CHAR = 256;

  // Using Array
  static void getOccuringCharUsingArray(String str) {
    // Create an array of size 256
    // i.e. ASCII_SIZE
    int count[] = new int[MAX_CHAR];
    int len = str.length();
    // Initialize count array index
    for (int i = 0; i < len; i++) count[str.charAt(i)]++;
    // Create an array of given String size
    char ch[] = new char[str.length()];
    for (int i = 0; i < len; i++) {
      ch[i] = str.charAt(i);
      int find = 0;
      for (int j = 0; j <= i; j++) {
        // If any matches found
        if (str.charAt(i) == ch[j]) find++;
      }
      if (find == 1)
        System.out.println(
            "Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
    }
  }

  static void getOccuringCharUsingList(String s) {
    List<Character> sequence = new ArrayList<>();
    int count[] = new int[MAX_CHAR];
    for (int i = 0; i < s.length(); i++) {
      count[s.charAt(i)]++;
      if (!sequence.contains(s.charAt(i))) sequence.add(s.charAt(i));
    }
    for (int i = 0; i < sequence.size(); i++)
      System.out.println(
          "Number of Occurrence of " + sequence.get(i) + " is:" + count[sequence.get(i)]);
  }

  static void getOccuringCharUsingHashMap(String inputString) {
    Map<Character, Integer> charCountMap = new HashMap<>();
    // Converting given string to char array
    char[] strArray = inputString.toCharArray();
    // checking each char of strArray
    for (char c : strArray) {
      if (charCountMap.containsKey(c)) {
        // If char is present in charCountMap,
        // incrementing its count by 1
        charCountMap.put(c, charCountMap.get(c) + 1);
      } else {
        // If char is not present in charCountMap,
        // putting this char to charCountMap with 1 as it's value
        charCountMap.put(c, 1);
      }
    }
    // Printing the charCountMap
    for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
      System.out.println("Number of Occurrence of " + entry.getKey() + " is:" + entry.getValue());
    }
  }

  // Driver Code
  public static void main(String[] args) {
    String str = "geeksforgeeks";
    System.out.println("Using array >>");
    getOccuringCharUsingArray(str);
    System.out.println("\nUsing List >>");
    getOccuringCharUsingList(str);
    System.out.println("\nUsing Hashmap >>");
    getOccuringCharUsingHashMap(str);
  }
}
