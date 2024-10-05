package Homework;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {
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
  public void testMergeSort() {
    MergeSort mergeSort = new MergeSort();
    List<Integer> expected = Arrays.asList(9, 22, 23, 35, 36, 43, 46, 51, 56, 56, 64, 71, 86, 90, 91);
    List<Integer> actual = Arrays.asList(91, 43, 9, 36, 90, 56, 23, 51, 46, 71, 22, 64, 86, 35, 56);
    assertEquals(expected, mergeSort.sort(actual));
  }

  @Test
  public void testMergeSortDuplicates() {
    MergeSort mergeSort = new MergeSort();
    List<Integer> expected = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2);
    List<Integer> actual = Arrays.asList(1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2);
    assertEquals(expected, mergeSort.sort(actual));
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
}
