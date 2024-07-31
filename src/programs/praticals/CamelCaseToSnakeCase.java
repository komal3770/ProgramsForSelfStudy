package programs.praticals;

import java.util.Scanner;

public class CamelCaseToSnakeCase {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter string in camel case:");
    String var = input.nextLine();
    String finalOp = "";
    for (int i = 0; i < var.length(); i++) {
      if (i > 0 && isUpperCase(var.charAt(i))) {
        finalOp = finalOp.concat("_");
      }
      finalOp = finalOp.concat(String.valueOf(var.charAt(i)).toLowerCase());
    }
    System.out.println("Camel Case: " + var);
    System.out.println("Snake Case: " + finalOp);
  }

  static boolean isUpperCase(char c) {
    int asciCode = c;
    return asciCode >= 65 && asciCode <= 90;
  }
}
