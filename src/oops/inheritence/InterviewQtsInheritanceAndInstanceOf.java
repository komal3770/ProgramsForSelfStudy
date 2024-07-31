package oops.inheritence;
/*
 * 
 * Inherited class object test
 */

class ParentTest {
	int i;
	void display(int i) {
		i=10;
		System.out.println(this.i);
	}
}
class ChildTest extends ParentTest {
	int j;
	void display(int j) {
		System.out.println("Child "+j);
	}
}


public class InterviewQtsInheritanceAndInstanceOf {

	public static void main(String[] args) {
		ParentTest child = new ParentTest();
		child.i = 1;
		//child.j = 2;
		child.display(2);
	}

}
