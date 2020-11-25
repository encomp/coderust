package com.toolinc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringKDistinctTest {

  /** Time complexity: The time complexity of the above algorithm will be O(N). */
  @Test
  public void shouldReturnLongestSubstring_withNoMoreThan_one_distinctChars() {
    int result = LongestSubstringKDistinct.findLength("araaci", 1);

    assertEquals(2, result);
  }

  /** Time complexity: The time complexity of the above algorithm will be O(N). */
  @Test
  public void shouldReturnLongestSubstring_withNoMoreThan_two_distinctChars() {
    int result = LongestSubstringKDistinct.findLength("araaci", 2);

    assertEquals(4, result);
  }

  /** Time complexity: The time complexity of the above algorithm will be O(N). */
  @Test
  public void shouldReturnLongestSubstring_withNoMoreThan_three_distinctChars() {
    int result = LongestSubstringKDistinct.findLength("cbbebi", 3);

    assertEquals(5, result);
  }
}
