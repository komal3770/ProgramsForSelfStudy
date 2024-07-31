package programs.praticals;

public class ThreadWaitAndSleep {

  public static void main(String[] args) {
    MyWaitThread t1 = new MyWaitThread();
    t1.start();
    synchronized (t1) {
      t1.notify();
    }
  }
}

class MyWaitThread extends Thread {
  public String s = "";

  @Override
  public void run() {
    synchronized (this) {
      int i = 0;
      while (i < 50) {
        s = s.concat(i + "");
        i++;
      }
      try {
        this.wait(10000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      System.out.println("Finised " + this.getState().name());
    }
  }
}
