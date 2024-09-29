package org.example;

abstract class Waterfowl extends Animal {
  void swim() {
    System.out.println(this.getClass().getSimpleName() + " плывет");
  }
}
