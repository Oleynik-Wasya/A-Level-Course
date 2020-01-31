package com.alevel.java.nix.hometask1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortBubbleTest {
    SortBubble sortBubble;

    @BeforeEach
    void setUp() {
        sortBubble = new SortBubble();
    }

    @Test
    void testSortBubble() {
        int[][] input = {{1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1},
                {-1, -5, -8, 9, 1},
                {0, 0, 1, 2, 5, 4}};
        int[][] output = {{1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {-8, -5, -1, 1, 9},
                {0, 0, 1, 2, 4, 5}};
        for (var i = 0; i < input.length; i++) {
            assertBubbleSort(input[i], output[i]);
        }
    }

    void assertBubbleSort(int[] array, int[] expected) {
        assertArrayEquals(expected, sortBubble.sort(array));
    }
}