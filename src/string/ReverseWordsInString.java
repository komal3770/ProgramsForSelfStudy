package string;

import java.util.Scanner;

/*
 * Reverse Words in a String from Leet Code
 * */
public class ReverseWordsInString {
  public String reverseWords(String s) {
    String outputStr = "";
    StringBuilder output = new StringBuilder();

    for (String word : s.trim().split("\\s+")) {
      if (!word.trim().isEmpty()) {
        outputStr = word.concat(" ").concat(outputStr);
      }
    }
    return outputStr.toString();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Input:");
    String s = in.nextLine();
    System.out.println("Output: " + new ReverseWordsInString().reverseWords(s));
  }
}
