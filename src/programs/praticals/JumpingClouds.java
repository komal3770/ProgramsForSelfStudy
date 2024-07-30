package programs.praticals;

import java.util.Scanner;

/*
* Problem statement: https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
* */
public class JumpingClouds {
  private static final Scanner scanner = new Scanner(System.in);

  static int jumpingOnClouds(int[] c) {
    int noOfJumps = 0;
    int len = c.length;
    int index = 0;
    while (index < len) {
      if ((index + 2) < len && c[index + 2] == 0) {
        noOfJumps++;
        index += 2;
        continue;
      } else if ((index + 1) < len && c[index + 1] == 0) {
        noOfJumps++;
      }
      index++;
    }

    return noOfJumps;
  }

  public static void main(String[] args) {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] c = new int[n];

    String[] cItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int cItem = Integer.parseInt(cItems[i]);
      c[i] = cItem;
    }
    int result = jumpingOnClouds(c);
    System.out.println(result);
    scanner.close();
  }
}
