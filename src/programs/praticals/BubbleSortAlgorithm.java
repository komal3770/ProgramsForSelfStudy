package programs.praticals;

public class BubbleSortAlgorithm {

  public static void main(String[] args) {
    int[] arr = {265, 8, 7, 15, 10, 758, 100};
    System.out.println("Before ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ",");
    }

    int n = arr.length;
    int temp = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (arr[j - 1] > arr[j]) {
          // swap elements
          temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }
      }
    }

    System.out.println();
    System.out.println("After ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ",");
    }
  }
}
