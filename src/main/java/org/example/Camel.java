package org.example;

class Camel extends Terrestrial {
  @Override
  public void eat(Food food) {
    if (food instanceof Grass) {
      System.out.println("Верблюд ест " + food.getType());
    } else {
      System.out.println("Верблюд не ест " + food.getType());
    }
  }
}
