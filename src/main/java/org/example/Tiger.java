package org.example;

class Tiger extends Terrestrial {
  @Override
  public void eat(Food food) {
    if (food instanceof Beef) {
      System.out.println("Тигр ест " + food.getType());
    } else {
      System.out.println("Тигр не ест " + food.getType());
    }
  }
}
