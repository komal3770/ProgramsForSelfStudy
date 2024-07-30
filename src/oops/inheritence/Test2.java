package oops.inheritence;

class AA
{
	AA(){
		System.out.println("AA");
	}
    int i = 10;
    
    void display() {
    	System.out.println("AA");
    }
}
class BB extends AA
{
	BB(){
		//super();
		this("a");
	}
	BB(String s){
		System.out.println("s "+s);
	}
	
    int i = 20;
    public void display() {
    	
    	System.out.println("BB");
    }
}

public class Test2 {
	public static void main(String[] args) {
		BB a = new BB();
	    System.out.println(a.i);
	    a.display();
	}
}
