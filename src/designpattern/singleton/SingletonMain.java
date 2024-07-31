package designpattern.singleton;


public class SingletonMain {
	public static void foo(Object o) {
		System.out.println("Object impl");
	}
	public static void foo(String s) {
		System.out.println("String impl");
	}
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				SingletonClass.getSingletonInstance().printSingleton();
				EagerSingleton.getInstance().print();
			}
		},"T1");
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				SingletonClass.getSingletonInstance().printSingleton();
				EagerSingleton.getInstance().print();
			}
		},"T2");
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				SingletonClass.getSingletonInstance().printSingleton();
				EagerSingleton.getInstance().print();
			}
		},"T3");
		Thread t4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				SingletonClass.getSingletonInstance().printSingleton();
				EagerSingleton.getInstance().print();
			}
		},"T4");
		Thread t5 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				SingletonClass.getSingletonInstance().printSingleton();
				EagerSingleton.getInstance().print();
			}
		},"T5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
		long longWithL = 365L;
		long longWithoutL = 365;
		System.out.println(longWithL);
		System.out.println(longWithoutL);
		foo(null);
	}

}
