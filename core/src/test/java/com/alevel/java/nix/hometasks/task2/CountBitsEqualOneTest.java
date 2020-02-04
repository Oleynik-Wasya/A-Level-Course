package com.alevel.java.nix.hometasks.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountBitsEqualOneTest {

    CountBitsEqualOne countBitsEqualOne;

    @BeforeEach
    void setUp() {
        countBitsEqualOne = new CountBitsEqualOne();
    }

    @Test
    void testCountBitsEqualOneTest() {
        long[] input = {347_693_485L, 1_232_222_111L, 122_123_794L, 999_999L, 0L};
        int[] output = {15, 18, 14, 12, 0};
        for (var i = 0; i < output.length; i++) {
            assertCountBitsEqualOneTest(input[i], output[i]);
        }
    }

    void assertCountBitsEqualOneTest(long value, int expected) {
        assertEquals(expected, countBitsEqualOne.count(value));
    }
}