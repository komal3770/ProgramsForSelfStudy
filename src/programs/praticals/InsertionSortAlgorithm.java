package programs.praticals;

public class InsertionSortAlgorithm {

  public static void main(String[] args) {
    int[] arr = {265, 8, 7, 15, 10, 758, 100};
    int temp;
    for (int i = 1; i < arr.length; i++) {
      for (int j = i; j > 0; j--) {
        if (arr[j - 1] > arr[j]) {
          temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ",");
    }
  }
}
