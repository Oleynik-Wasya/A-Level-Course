package com.alevel.java.nix.hometask1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTest {
    PowerOf powerOf;

    @BeforeEach
    void setUp() {
        powerOf = new PowerOf();
    }

    @Test
    void testArrayPowerOf() {
        int[][] input1 = {{1, 2, 3, 4, 5},
                {-2, -5, -6, -7},
                {1, 5, 1, 5, 1},
                {2, 4, 6, 8, 10}};
        int[] input2 = {3, 2, 2, 5};
        int[][] output = {{3},
                {-2, -6},
                {},
                {10}};
        for (var i = 0; i < output[0].length; i++) {
            assertArrayPowerOf(input1[i], input2[i], output[i]);
        }
    }

    void assertArrayPowerOf(int[] array, int value, int[] result) {
        assertArrayEquals(result, powerOf.arrayPowerOf(array, value));
    }
}