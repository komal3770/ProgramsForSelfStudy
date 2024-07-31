package programs.praticals;

public class SumOfDigits {

	public static void main(String[] args) {
		// the line below this gives an output 
        // \u000d System.out.println("comment executed");
	}
	
	public static int addNumbers(int num,int sum) {
		int lastDigit = num%10;
		sum+=lastDigit;
		if(num > 0) {
			sum = addNumbers(num/10,sum); 
		}
		return sum;
	}

}
