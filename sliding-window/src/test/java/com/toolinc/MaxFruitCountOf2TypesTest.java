package com.toolinc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxFruitCountOf2TypesTest {

    /** Time complexity: The time complexity of the above algorithm will be O(N). */
    @Test
    public void shouldReturnMaxFruitCountOf2Types_3() {
        int result = MaxFruitCountOf2Types.findLength(new char[] {'A', 'B', 'C', 'A', 'C'});

        assertEquals(3, result);
    }

    /** Time complexity: The time complexity of the above algorithm will be O(N). */
    @Test
    public void shouldReturnMaxFruitCountOf2Types_5() {
        int result = MaxFruitCountOf2Types.findLength(new char[] {'A', 'B', 'C', 'B', 'B', 'C'});

        assertEquals(5, result);
    }
}
