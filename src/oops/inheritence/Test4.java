package oops.inheritence;
/*
 * 
 * Inherited class object test
 */

class Parent4{
	int i;
	void display(int i) {
		i=10;
		System.out.println(this.i);
	}
}
class Child4 extends Parent4{
	int j;
	void display(int j) {
		System.out.println("Child "+j);
	}
}


public class Test4 {

	public static void main(String[] args) {
		Parent4 child = new Parent4();
		child.i = 1;
		//child.j = 2;
		child.display(2);
	}

}
