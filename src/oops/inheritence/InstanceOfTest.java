package oops.inheritence;

class InstanceParent{
	
}
class InstanceChild1 extends InstanceParent{
	
}

class InstanceChild2 extends InstanceParent{
	
}
public class InstanceOfTest {

	public static void main(String[] args) {
		InstanceParent o1 = new InstanceParent();
		System.out.println("InstanceParent");
		System.out.println(o1 instanceof InstanceParent);
		System.out.println(o1 instanceof InstanceChild1);
		System.out.println(o1 instanceof InstanceChild2);
		System.out.println("InstanceChild1");
		InstanceChild1 o2 = new InstanceChild1();
		System.out.println(o2 instanceof InstanceParent);
		System.out.println(o2 instanceof InstanceChild1);
		System.out.println("InstanceChild2");
		InstanceChild2 o3 = new InstanceChild2();
		System.out.println(o3 instanceof InstanceParent);
		//System.out.println(o3 instanceof InstanceChild1);
		System.out.println(o3 instanceof InstanceChild2);
		
		InstanceParent po1 = new InstanceChild1();
		System.out.println("InstanceParent - InstanceChild1");
		System.out.println(po1 instanceof InstanceParent);
		System.out.println(po1 instanceof InstanceChild1);
		System.out.println(po1 instanceof InstanceChild2);
	}

}
