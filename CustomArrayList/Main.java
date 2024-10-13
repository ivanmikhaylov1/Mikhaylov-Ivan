package CustomArrayList;

public class Main {
  public static void main(String[] args) {
    CustomArrayList<Integer> list = new CustomArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(10);
    list.add(11);
    try {
      System.out.println("Удаленный элемент по индексу 1: " + list.remove(1));
      System.out.println("Удаленный элемент по индексу 4: " + list.remove(4));
      System.out.println("Удаленный элемент по индексу 0: " + list.remove(0));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try {
      list.add(null);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    try {
      list.get(-1);
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }
    try {
      list.get(100);
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }
    try {
      list.remove(-1);
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }
    try {
      list.remove(100);
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }
  }
}