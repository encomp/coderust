package com.toolinc;

/**
 * Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any
 * contiguous subarray of size ‘k’.
 *
 * <p>Input: [2, 1, 5, 1, 3, 2], k=3
 *
 * <p>Output: 9
 *
 * <p>Explanation: Subarray with maximum sum is [5, 1, 3].
 */
public final class MaxSumSubArrayOfSizeK {

  public static int findMaxSumSubArray(int k, int[] arr) {
    int maxSum = 0;

    for (int i = 0, windowStart = 0, currentSum = 0; i < arr.length; i++) {
      currentSum += arr[i];
      if (i >= k - 1) {
        if (maxSum < currentSum) {
          maxSum = currentSum;
        }
        currentSum -= arr[windowStart++];
      }
    }

    return maxSum;
  }
}
