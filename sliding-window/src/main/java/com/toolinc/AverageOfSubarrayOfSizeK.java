package com.toolinc;

/**
 * Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
 *
 * <p>Input: Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
 *
 * <p>Output: [2.2, 2.8, 2.4, 3.6, 2.8]
 */
public final class AverageOfSubarrayOfSizeK {

  public static double[] findAveragesBruteForce(int K, int[] arr) {
    double[] result = new double[arr.length - K + 1];

    for (int i = 0; i <= arr.length - K; i++) {
      double sum = 0;
      for (int j = i; j < i + K; j++) {
        sum += arr[j];
      }
      result[i] = sum / K;
    }

    return result;
  }

  public static double[] findAveragesOptimized(int K, int[] arr) {
    double[] result = new double[arr.length - K + 1];
    double sum = 0;

    for (int i = 0, j = 0; i < arr.length && j < result.length; j++) {
      while (i < j + K) {
        sum += arr[i++];
      }
      result[j] = sum / K;
      sum -= arr[j];
    }

    return result;
  }

  public static double[] findAverages(int K, int[] arr) {
    double[] result = new double[arr.length - K + 1];
    double windowSum = 0;
    int windowStart = 0;

    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
      windowSum += arr[windowEnd]; // Add the next element
      // Slide the window, we don't need to slide if we've not hit the required window size of 'k'
      if (windowEnd >= K - 1) {
        result[windowStart] = windowSum / K; // Calculate the average
        windowSum -= arr[windowStart]; // Subtract the element going out
        windowStart++; // Slide the window ahead
      }
    }

    return result;
  }
}
