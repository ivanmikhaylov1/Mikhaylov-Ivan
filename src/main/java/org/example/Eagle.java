package org.example;

class Eagle extends Flying {
  @Override
  public void eat(Food food) {
    if (food instanceof Beef) {
      System.out.println("Орел ест " + food.getType());
    } else {
      System.out.println("Орел не ест " + food.getType());
    }
  }
}
