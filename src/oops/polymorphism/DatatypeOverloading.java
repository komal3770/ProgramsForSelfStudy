package oops.polymorphism;

/*
 * Highlight the rules for Method overloading
 * https://www.geeksforgeeks.org/method-overloading-in-java/#:~:text=What%20if%20the%20exact%20prototype%20does%20not%20match%20with%20arguments%3F
 * */

public class DatatypeOverloading {
  public static void main(String[] args) {
    new DatatypeOverloading().display(3);
  }

  public void display(short f) {
    System.out.println("short");
  }

  public void display(Double f) {
    System.out.println("Double class");
  }

  public void display(Object f) {
    System.out.println("object");
  }
}
