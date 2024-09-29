package org.example;

abstract class Flying extends Animal {
  void fly() {
    System.out.println(this.getClass().getSimpleName() + " летает");
  }
}
