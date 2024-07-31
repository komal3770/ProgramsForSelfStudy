package designpattern.singleton;

import java.lang.reflect.Constructor;

public class TestSingleton {

  public static void main(String[] args) {
    // SingletonClass.getSingletonInstance().printSingleton();
    // EagerSingleton.getInstance().print();

    ReflectionFreeSingleton obj1 = ReflectionFreeSingleton.getInstance();
    ReflectionFreeSingleton obj3 = ReflectionFreeSingleton.getInstance();
    ReflectionFreeSingleton obj2 = null;
    try {
      Constructor[] constructors = ReflectionFreeSingleton.class.getDeclaredConstructors();
      for (Constructor constructor : constructors) {
        constructor.setAccessible(true);
        obj2 = (ReflectionFreeSingleton) constructor.newInstance();
        break;
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Obj1 " + obj1.hashCode());
    System.out.println("Obj3 " + obj3.hashCode());
    System.out.println("Obj2 " + obj2.hashCode());
  }
}
