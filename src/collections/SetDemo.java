package collections;

import java.util.HashSet;
import java.util.Set;

class User {
  int id;
  String name;

  public User(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    User user = (User) o;

    if (id != user.id) {
      return false;
    }
    return name.equals(user.name);
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + name.hashCode();
    return result;
  }
}

public class SetDemo {
  public static void main(String[] args) {
    Set<String> sets = new HashSet<>();
    sets.add("Abc");
    sets.add("Abc");
    sets.add("Pqr");
    System.out.println(sets.size());

    Set<User> users = new HashSet<>();
    users.add(new User(1, "Abc"));
    users.add(new User(1, "Abc"));
    users.add(new User(2, "Pqr"));

    System.out.println(users.size());
  }
}
