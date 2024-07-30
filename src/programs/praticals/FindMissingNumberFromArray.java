package programs.praticals;

public class FindMissingNumberFromArray {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 5, 6, 7};
    System.out.println(getMissingNumber(arr));
  }

  public static int getMissingNumber(int[] arr) {
    int total = (arr.length + 1) * (arr.length + 2) / 2;
    int sum = 0;
    for (int j : arr) {
      sum += j;
    }
    return total - sum;
  }
}
