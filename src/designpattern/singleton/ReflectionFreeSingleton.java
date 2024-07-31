package designpattern.singleton;

public class ReflectionFreeSingleton {
  private static ReflectionFreeSingleton reflectionFreeSingleton = new ReflectionFreeSingleton();

  private ReflectionFreeSingleton() {
    if (reflectionFreeSingleton != null) {
      throw new RuntimeException("Use getInstance() method to get the instance");
    }
  }

  public static ReflectionFreeSingleton getInstance() {
    return reflectionFreeSingleton;
  }
}
