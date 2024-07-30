package oops.polymorphism;
/*
* Concept of Method overloading. Check the rules of how overloading decides which method to give priority.
* */
public class Test1 {
	void display(float i) {
		System.out.println("float");
	}
	
	void display(short i) {
		System.out.println("short");
	}
	
	void display(Double i) {
		System.out.println("double");
	}
	
	void display(Integer i) {
		System.out.println("Integer");
	}
	
	public static void main(String[] args) {
		TestChild t1 = new TestChild();
		t1.display(1);
		t1.display(1.0);
		t1.display(100);
	}
}
class TestChild extends Test1{
	void display(Double i) {
		System.out.println("double");
	}
}