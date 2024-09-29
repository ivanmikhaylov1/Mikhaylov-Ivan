package org.example;

class Horse extends Terrestrial {
  @Override
  public void eat(Food food) {
    if (food instanceof Grass) {
      System.out.println("Лошадь ест " + food.getType());
    } else {
      System.out.println("Лошадь не ест " + food.getType());
    }
  }
}
