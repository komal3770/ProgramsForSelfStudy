package string;

public class ThreadRunAndStart {
  public static void main(String[] args) {
    Thread t1 =
        new Thread(
            new Runnable() {

              @Override
              public void run() {

                for (int i = 0; i < 1000; i++) {}

                try {
                  Thread.sleep(10000);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
                System.out.println("t1 running " + Thread.currentThread().getName());
              }
            });
    t1.start();
    try {
      t1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Thread t2 =
        new Thread(
            new Runnable() {

              @Override
              public void run() {
                System.out.println("t2 running " + Thread.currentThread().getName());
              }
            });
    t2.start();
  }
}
