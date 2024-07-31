package programs.praticals;

class TestThread implements Runnable {
  static boolean flag = true;

  @Override
  public void run() {
    System.out.println("A");
    System.out.println("A");
    if (flag) {
      flag = false;
      throw new RuntimeException();
    }
  }
}

public class ThreadTest {

  public static void main(String[] args) {
    TestThread t1 = new TestThread();

    Thread thread = new Thread(t1);
    Thread thread2 = new Thread(t1);
    thread.start();

    System.out.println("B");
    try {
      thread.join();

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    thread2.start();
    System.out.println("C");
  }
}
