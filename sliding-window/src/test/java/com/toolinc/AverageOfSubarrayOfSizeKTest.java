package com.toolinc;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class AverageOfSubarrayOfSizeKTest {

  /**
   * Time complexity: Since for every element of the input array, we are calculating the sum of its
   * next ‘K’ elements, the time complexity of the above algorithm will be O(N*K) where ‘N’ is the
   * number of elements in the input array.
   */
  @Test
  public void shouldReturnAverages_bruteForce() {
    double[] expectedResult = new double[] {2.2, 2.8, 2.4, 3.6, 2.8};
    double[] result =
        AverageOfSubarrayOfSizeK.findAveragesBruteForce(5, new int[] {1, 3, 2, 6, -1, 4, 1, 8, 2});

    assertArrayEquals(expectedResult, result);
  }

  /** Time complexity: The time complexity of the above algorithm will be O(N). */
  @Test
  public void shouldReturnAverages_optimized() {
    double[] expectedResult = new double[] {2.2, 2.8, 2.4, 3.6, 2.8};
    double[] result =
        AverageOfSubarrayOfSizeK.findAveragesOptimized(5, new int[] {1, 3, 2, 6, -1, 4, 1, 8, 2});

    assertArrayEquals(expectedResult, result);
  }

  /** Time complexity: The time complexity of the above algorithm will be O(N). */
  @Test
  public void shouldReturnAverages() {
    double[] expectedResult = new double[] {2.2, 2.8, 2.4, 3.6, 2.8};
    double[] result =
        AverageOfSubarrayOfSizeK.findAverages(5, new int[] {1, 3, 2, 6, -1, 4, 1, 8, 2});

    assertArrayEquals(expectedResult, result);
  }
}
