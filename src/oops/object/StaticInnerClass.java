package oops.object;

import java.io.IOException;

public class StaticInnerClass {
  static int b;
  final int c = 1;
  public int a;
  protected int z;
  int x;
  private int y;
  protected StaticInnerClass() throws IOException, SecurityException {
    super();
    // TODO Auto-generated constructor stub
  }

  public static void main(String[] args) throws SecurityException, IOException {
    InnerClass.r = 10;
    System.out.println(InnerClass.r);
    InnerClass.r = 11;
    StaticInnerClass s = new StaticInnerClass();
  }

  static class InnerClass {
    static int r;
    final int w = 8;
    public int p;
    private int q;

    public InnerClass() {
      b = 5;

      // Not Accessible
      /*
      x = 1;
      y=2;
      z=3;
      a=4;
      c=6;*/
    }
  }
}
