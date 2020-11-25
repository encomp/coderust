package com.toolinc;

/**
 * Given an array of positive numbers and a positive number ‘S,’ find the length of the smallest
 * contiguous subarray whose sum is greater than or equal to ‘S’. Return 0 if no such subarray
 * exists.
 *
 * <p>Input: [2, 1, 5, 2, 3, 2], S=7
 *
 * <p>Output: 2
 *
 * <p>Explanation: The smallest subarray with a sum great than or equal to '7' is [5, 2].
 */
public final class MinSizeSubArraySum {

  public static int findMinSubArray(int S, int[] arr) {
    int smallest = Integer.MAX_VALUE;

    for (int i = 0, currentSum = 0, windowStart = 0; i < arr.length; i++) {
      currentSum += arr[i];
      while (currentSum >= S) {
        if (i - windowStart < smallest) {
          smallest = i - windowStart + 1;
        }
        currentSum -= arr[windowStart++];
      }
    }
    return smallest;
  }
}
