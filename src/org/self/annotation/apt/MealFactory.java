package org.self.annotation.apt;


public class MealFactory {

  public Meal create(String id) {
    if (id == null) {
      throw new IllegalArgumentException("id is null!");
    }
    if ("CalzonePizza".equals(id)) {
      return new org.self.annotation.apt.CalzonePizza();
    }

    if ("MargheritaPizza".equals(id)) {
      return new org.self.annotation.apt.MargheritaPizza();
    }

    if ("Tiramisu".equals(id)) {
      return new org.self.annotation.apt.Tiramisu();
    }

    throw new IllegalArgumentException("Unknown id = " + id);
  }
}
