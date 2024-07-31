package programs.praticals;

import java.util.Scanner;

public class StringGame {
  private static final Scanner scanner = new Scanner(System.in);

  // Complete the repeatedString function below.
  static long repeatedString(String s, long n) {
    long countOfA = 0;
    int strLen = s.length();
    String repeatedString = s;
    for (int i = strLen; i < n; i += strLen) {
      repeatedString = repeatedString.concat(s);
      if (repeatedString.length() > n) {
        repeatedString = repeatedString.substring(0, (int) n);
      }
    }
    strLen = repeatedString.length();
    for (int i = 0; i < strLen; i++) {
      if (repeatedString.charAt(i) == 'a') {
        countOfA++;
      }
    }
    return countOfA;
  }

  public static void main(String[] args) {

    String s = scanner.nextLine();

    long n = scanner.nextLong();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    long result = repeatedString(s, n);
    System.out.println(result);
    scanner.close();
  }
}
