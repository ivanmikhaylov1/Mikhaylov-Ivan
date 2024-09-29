package org.example;

class Dolphin extends Waterfowl {
  @Override
  public void eat(Food food) {
    if (food instanceof Fish) {
      System.out.println("Дельфин ест " + food.getType());
    } else {
      System.out.println("Дельфин не ест " + food.getType());
    }
  }
}
