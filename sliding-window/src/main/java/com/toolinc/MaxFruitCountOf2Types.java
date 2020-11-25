package com.toolinc;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of characters where each character represents a fruit tree, you are given two
 * baskets, and your goal is to put maximum number of fruits in each basket. The only restriction is
 * that each basket can have only one type of fruit.
 *
 * <p>You can start with any tree, but you can’t skip a tree once you have started. You will pick
 * one fruit from each tree until you cannot, i.e., you will stop when you have to pick from a third
 * fruit type.
 *
 * <p>Input: Fruit=['A', 'B', 'C', 'A', 'C']
 *
 * <p>Output: 3
 *
 * <p>Explanation: We can put 2 'C' in one basket and one 'A' in the other from the subarray ['C',
 * 'A', 'C']
 */
public final class MaxFruitCountOf2Types {

  public static int findLength(char[] arr) {
    Map<Character, Integer> baskets = new HashMap<>();
    int longest = 0;

    for (int i = 0, windowStart = 0; i < arr.length; i++) {
      char currentChar = arr[i];
      baskets.put(currentChar, baskets.getOrDefault(currentChar, 0) + 1);

      while (baskets.size() > 2) {
        char firstChar = arr[windowStart];
        int counter = baskets.get(firstChar) - 1;
        baskets.put(firstChar, counter);
        if (counter == 0) {
          baskets.remove(firstChar);
        }
        windowStart++;
      }

      longest = Math.max(longest, i - windowStart + 1);
    }

    return longest;
  }
}
