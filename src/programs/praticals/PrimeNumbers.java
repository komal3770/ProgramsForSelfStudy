package programs.praticals;

public class PrimeNumbers {

  public static boolean isPrime(int num) {
    boolean isValid = true;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        isValid = false;
        break;
      }
    }
    return isValid;
  }

  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) if (isPrime(i)) System.out.print(i + " ");
  }
}
