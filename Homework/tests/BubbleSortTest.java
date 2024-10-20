package Homework.tests;

import Homework.Sorts.BubbleSort;
import Homework.Sorts.MergeSort;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
  @Test
  public void testBubbleSort() throws IllegalAccessException {
    BubbleSort bubbleSort = new BubbleSort(50);
    List<Integer> expected = Arrays.asList(1, 2, 4, 6, 7, 8, 9, 10, 11, 13, 114);
    List<Integer> actual = Arrays.asList(13, 2, 7, 8, 1, 10, 6, 11, 114, 4, 9);
    assertEquals(expected, bubbleSort.sort(actual));
  }

  @Test
  public void testBubbleSortLimits() {
    BubbleSort bubbleSort = new BubbleSort(2);
    List<Integer> actual = Arrays.asList(13, 2, 7, 8, 1, 10, 6, 11, 114, 4, 9);
    assertThrows(IllegalAccessException.class, () -> bubbleSort.sort(actual));
  }

  @Test
  public void testEmptyBubbleSort() {
    MergeSort mergeSort = new MergeSort();
    List<Integer> expected = Arrays.asList();
    List<Integer> actual = Arrays.asList();
    assertEquals(expected, mergeSort.sort(actual));
  }

  @Test
  public void testNegativeBubbleSort() throws IllegalAccessException {
    BubbleSort bubbleSort = new BubbleSort(50);
    List<Integer> expected = Arrays.asList(-100, -20, -14, -6, -3, 8, 9, 10, 11, 13, 114);
    List<Integer> actual = Arrays.asList(13, -20, -3, 8, -100, 10, -6, 11, 114, -14, 9);
    assertEquals(expected, bubbleSort.sort(actual));
  }

  @Test
  public void testBubbleSortSingleElement() throws IllegalAccessException {
    BubbleSort bubbleSort = new BubbleSort(50);
    List<Integer> expected = Arrays.asList(5);
    List<Integer> actual = Arrays.asList(5);
    assertEquals(expected, bubbleSort.sort(actual));
  }

  @Test
  public void testBubbleSort_ExceedMaxElements() {
    BubbleSort bubbleSort = new BubbleSort(5);
    List<Integer> actual = Arrays.asList(1, 2, 3, 4, 5, 6);
    Exception exception = assertThrows(IllegalAccessException.class, () -> bubbleSort.sort(actual));
    assertEquals("Превышено максимальное количество элементов (50)",exception.getMessage());
  }
}