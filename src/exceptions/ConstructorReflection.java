package exceptions;

import java.lang.reflect.InvocationTargetException;

public class ConstructorReflection {

  private ConstructorReflection(String s) {
    System.out.println("In constructor " + s);
  }

  public static void main(String[] args) {
    Class<ConstructorReflection> cls = ConstructorReflection.class;
    try {
      ConstructorReflection obj =
          cls.getDeclaredConstructor(String.class)
              .newInstance("Hi There"); // cls.newInstance() is deprecated
      System.out.println(obj);

    } catch (InstantiationException | IllegalAccessException e) {
      e.printStackTrace();
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (SecurityException e) {
      e.printStackTrace();
    }
  }
}
