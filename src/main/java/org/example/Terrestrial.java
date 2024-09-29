package org.example;

abstract class Terrestrial extends Animal {
  void walk() {
    System.out.println(this.getClass().getSimpleName() + " идет");
  }
}
