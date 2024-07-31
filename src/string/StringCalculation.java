package string;

import java.util.Scanner;

public class StringCalculation {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter alphabets ");
    System.out.println("Ans " + getStringValue(in.nextLine()));
    in.close();
  }

  public static int getStringValue(String s) {
    int a = (int) 'A' - 1;
    System.out.println("a " + a);
    int returnValue = 0;
    for (char in : s.toCharArray()) {
      System.out.println("in " + (int) in);
      returnValue *= 26;
      System.out.println("returnValue 1 " + returnValue);
      returnValue += (int) in - a;
      System.out.println("returnValue 2 " + returnValue);
    }
    return returnValue;
  }
}
