package programs.praticals;
/**
 * @author komal
 * Program to find larget & second-largest integer from an given array
 *
 * */
public class ArraySort {
	public static void main(String[] args) {
		int[] arr = {2,4,1,5,4};
		int largestNum = 0;
		int secondLargest = 0;
        for (int j : arr) {
            if (j > largestNum) {
                largestNum = j;
            } else if (j > secondLargest) {
                secondLargest = j;
            }
        }
		System.out.println(STR."Largest num \{largestNum} secondlargest \{secondLargest}");
	}
}
