package CustomArrayList;

/**
 * Класс CustomArrayList реализует интерфейс CustomArrayListInterface и предоставляет базовую функциональность динамического массива.
 *
 * @param <A> тип элементов, которые будут храниться в списке
 */
public class CustomArrayList<A> implements CustomArrayListInterface<A> {

  /**
   * Текущий размер списка (количество элементов).
   */
  private int actualSize = 0;

  /**
   * Массив для хранения элементов списка.
   */
  private Object[] array;

  /**
   * Начальная емкость массива.
   */
  private static final int CAPACITY = 10;

  /**
   * Конструктор для инициализации массива с начальной емкостью.
   */
  public CustomArrayList() {
    this.array = new Object[CAPACITY];
  }

  /**
   * Увеличивает емкость массива в два раза.
   */
  private void increaseCapacity() {
    int newCapacity = array.length * 2;
    array = java.util.Arrays.copyOf(array, newCapacity);
  }

  /**
   * Добавляет элемент в конец списка.
   *
   * @param element элемент, который нужно добавить
   * @throws IllegalArgumentException если переданный элемент равен null
   */
  @Override
  public void add(A element) {
    if (element == null) {
      throw new IllegalArgumentException("Элемент не может быть null");
    }
    if (actualSize == array.length) {
      increaseCapacity();
    }
    array[actualSize++] = element;
  }

  /**
   * Возвращает элемент, находящийся по указанному индексу.
   *
   * @param index индекс элемента для получения
   * @return элемент, находящийся по указанному индексу
   * @throws IndexOutOfBoundsException если индекс меньше 0 или больше или равен actualSize
   */
  @Override
  public A get(int index) {
    if (index < 0 || index >= actualSize) {
      throw new IndexOutOfBoundsException("Индекс за пределами допустимого диапазона");
    }
    return (A) array[index];
  }

  /**
   * Удаляет элемент, находящийся по указанному индексу, и возвращает его.
   *
   * @param index индекс элемента для удаления
   * @return удаленный элемент
   * @throws IndexOutOfBoundsException если индекс меньше 0 или больше или равен actualSize
   */
  @Override
  public A remove(int index) {
    if (index < 0 || index >= actualSize) {
      throw new IndexOutOfBoundsException("Индекс за пределами допустимого диапазона");
    }
    A removedElement = (A) array[index];
    for (int i = index; i < actualSize - 1; i++) {
      array[i] = array[i + 1];
    }
    array[--actualSize] = null; // Помогает сборщику мусора
    return removedElement;
  }
}