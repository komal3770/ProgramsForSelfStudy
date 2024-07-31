package oops.inheritence;

import java.lang.reflect.Field;

public class GenericsWithInheritence {

  public static void main(String[] args) {
    A a = new A();
    // A a = new B(); //Uncomment and check how generics behave in inheritance
    a.setId("1");
    a.setName("komal");
    Class c = a.getClass();
    for (Field f : a.getClass().getDeclaredFields()) {
      f.setAccessible(true);
      try {
        Field f2 = c.getDeclaredField(f.getName());
        f2.setAccessible(true);
        System.out.println(f.get(a)); // Printing values
      } catch (IllegalArgumentException
          | IllegalAccessException
          | NoSuchFieldException
          | SecurityException e) {
        e.printStackTrace();
      }
    }
  }
}

class A {
  private String id;
  private String name;

  /**
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }
}

class B extends A {
  private void demo() {
    System.out.println("child");
  }
}
