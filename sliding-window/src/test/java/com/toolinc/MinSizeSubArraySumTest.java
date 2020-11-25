package com.toolinc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinSizeSubArraySumTest {

  /** Time complexity: The time complexity of the above algorithm will be O(N). */
  @Test
  public void shouldMinSubArray_1() {
    int result = MinSizeSubArraySum.findMinSubArray(7, new int[] {2, 1, 5, 2, 8});

    assertEquals(1, result);
  }

  /** Time complexity: The time complexity of the above algorithm will be O(N). */
  @Test
  public void shouldMinSubArray_2() {
    int result = MinSizeSubArraySum.findMinSubArray(7, new int[] {2, 1, 5, 2, 3, 2});

    assertEquals(2, result);
  }

  /** Time complexity: The time complexity of the above algorithm will be O(N). */
  @Test
  public void shouldMinSubArray_3() {
    int result = MinSizeSubArraySum.findMinSubArray(8, new int[] {3, 4, 1, 1, 6});

    assertEquals(3, result);
  }
}
