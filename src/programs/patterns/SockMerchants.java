package programs.patterns;

import java.util.Scanner;

public class SockMerchants {
    private static final Scanner scanner = new Scanner(System.in);

	static int sockMerchant(int n, int[] ar) {
		int count = 0;
		int len = ar.length;
		for(int i=0;i<len;i++) {
			for (int j = i+1; j < len; j++) {
				if(ar[i] == ar[j]) {
					count++;
					ar[j] = ar[len-1];
					len = len-1;
					j--;
					break;
				}
			}
		}
		return count;
    }
	
	public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println("Result "+result);

        scanner.close();
	}

}
