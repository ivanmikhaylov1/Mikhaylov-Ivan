package org.example;

public class Main {
  public static void main(String[] args) {
    Horse horse = new Horse();
    horse.walk();
    horse.eat(new Fish());
    Tiger tiger = new Tiger();
    tiger.walk();
    tiger.eat(new Beef());
    Dolphin dolphin = new Dolphin();
    dolphin.swim();
    dolphin.eat(new Fish());
    Eagle eagle = new Eagle();
    eagle.fly();
    eagle.eat(new Grass());
    Camel camel = new Camel();
    camel.walk();
    camel.eat(new Grass());
  }
}