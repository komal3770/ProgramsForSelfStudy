package designpattern.singleton;

public class EagerSingleton {
	private static EagerSingleton eagerSingleton = new EagerSingleton();
	private EagerSingleton() {
		System.out.println("Initialized");
	}
	public static EagerSingleton getInstance() {
		return eagerSingleton;
	}
	public void print() {
		System.out.println("Eager "+eagerSingleton.hashCode());
	}
}
