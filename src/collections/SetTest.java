package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Role {
  Integer id;
  String name;

  public Role(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Role [id=" + id + ", name=" + name + ", hashcode=" + this.hashCode() + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Role other = (Role) obj;
    if (id == null) {
      if (other.id != null) return false;
    } else if (!id.equals(other.id)) return false;
    return true;
  }
}

public class SetTest {

  public static void main(String[] args) {
    Set<Role> roles = new HashSet<Role>();

    Role r1 = new Role(1, "komal");
    Role r2 = new Role(2, "nikhil");
    Role r3 = new Role(1, "komal");
    Role r4 = new Role(3, "sanket");
    Role r5 = new Role(4, "raj");
    Role r6 = new Role(5, "aniket");
    Role r7 = new Role(6, "rahul");

    roles.add(r1);
    roles.add(r2);
    roles.add(r3);
    roles.add(r4);
    roles.add(r5);
    roles.add(r6);
    roles.add(r7);

    for (Role r : roles) {
      System.out.println(r.getName());
    }
    System.out.println("========================");

    Set<String> strs = new TreeSet<String>();
    strs.add(new String("komal"));
    strs.add(new String("komal"));
    strs.add(new String("nikhil"));
    System.out.println(strs);
  }
}
