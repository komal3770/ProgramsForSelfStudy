package programs.praticals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FileReading {

  public static void main(String[] args) {
    try {
      Scanner in = new Scanner(new FileReader("D:\\readThis.txt"));
      StringBuilder sb = new StringBuilder();
      Map<String, Integer> countCheck = new HashMap<>();

      while (in.hasNext()) {
        String val = in.next();
        sb.append(val + " ");
        int count = (countCheck == null || countCheck.get(val) == null) ? 0 : countCheck.get(val);
        System.out.println(val + " " + count);
        countCheck.put(val, ++count);
      }
      in.close();
      String outString = sb.toString();
      System.out.println(outString);
      System.out.println(countCheck);
      for (Entry<String, Integer> entry : countCheck.entrySet()) {
        if (entry.getValue() > 1) {
          System.out.println("Repeated word " + entry.getKey() + " " + entry.getValue());
        }
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
