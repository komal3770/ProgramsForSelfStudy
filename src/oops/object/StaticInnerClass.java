package oops.object;

import java.io.IOException;

public class StaticInnerClass {
  protected StaticInnerClass() throws IOException, SecurityException {
    super();
    // TODO Auto-generated constructor stub
  }

  int x;
  private int y;
  protected int z;
  public int a;
  static int b;
  final int c = 1;

  static class InnerClass {
    private int q;
    public int p;
    static int r;
    final int w = 8;

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

  public static void main(String[] args) throws SecurityException, IOException {
    InnerClass.r = 10;
    System.out.println(InnerClass.r);
    InnerClass.r = 11;
    StaticInnerClass s = new StaticInnerClass();
  }
}
