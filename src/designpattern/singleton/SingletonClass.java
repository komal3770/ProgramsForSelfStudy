package designpattern.singleton;

public class SingletonClass {
	private static SingletonClass singletonInstance;
	
	/** Don't let anyone else instantiate this class */
    private SingletonClass() {
    	System.out.println("Instance created");
    }
    
    // Providing Global point of access
    public static synchronized SingletonClass getSingletonInstance() {
        if (null == singletonInstance) {
            singletonInstance = new SingletonClass();
        }
        return singletonInstance;
    }
    
    public void printSingleton(){
        System.out.println("Inside print Singleton "+this.hashCode()+"-"+Thread.currentThread().getName());
    }

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cannot Clone");
	}
    
    
}
