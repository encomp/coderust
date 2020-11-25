package com.toolinc;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring in it with no more than K distinct
 * characters.
 *
 * <p>Input: String="araaci", K=2
 *
 * <p>Output: 4
 *
 * <p>Explanation: The longest substring with no more than '2' distinct characters is "araa".
 */
public final class LongestSubstringKDistinct {

  public static int findLength(String str, int k) {
    Map<Character, Integer> uniqueLetters = new HashMap<>();
    int longest = 0;

    for (int i = 0, windowStart = 0; i < str.length(); i++) {
      char currentChar = str.charAt(i);
      uniqueLetters.put(currentChar, uniqueLetters.getOrDefault(currentChar, 0) + 1);

      while (uniqueLetters.size() > k) {
        char firstChar = str.charAt(windowStart);
        int counter = uniqueLetters.get(firstChar) - 1;
        uniqueLetters.put(firstChar, counter);
        if (uniqueLetters.get(firstChar) == 0) {
          uniqueLetters.remove(firstChar);
        }
        ++windowStart;
      }

      longest = Math.max(longest, i - windowStart + 1);
    }

    return longest;
  }
}
