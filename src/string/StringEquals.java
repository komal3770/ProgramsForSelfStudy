package string;

import java.util.Scanner;

public class StringEquals {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Input ");
    Integer s1 = in.nextInt();
    System.out.println("Input 2");
    String s2 = in.nextLine();
    System.out.println("Enter 3");
    Integer s3 = in.nextInt();
    System.out.println("Input 2");
    System.out.println(s1 + " " + s2 + " " + s3);
  }
}
