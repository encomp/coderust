package com.toolinc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxSumSubArrayOfSizeKTest {

  /** Time complexity: The time complexity of the above algorithm will be O(N). */
  @Test
  public void shouldReturnMaxSum_9() {
    int result = MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[] {2, 1, 5, 1, 3, 2});

    assertEquals(9, result);
  }

  /** Time complexity: The time complexity of the above algorithm will be O(N). */
  @Test
  public void shouldReturnMaxSum_7() {
    int result = MaxSumSubArrayOfSizeK.findMaxSumSubArray(2, new int[] {2, 3, 4, 1, 5});

    assertEquals(7, result);
  }
}
