package com.alevel.java.nix.hometask1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxAndMinTest {
    @Test
    void testFindMin() {
        int[][] input = {{1, 2, 3, 4, 5},
                {-1, -2, -3, -4, -5},
                {0, 0, 0, 0, 0, 0, 0},
                {-1, 2, -3, 4, -5}};
        int[] output = {1, -5, 0, -5};
        for (var i = 0; i < output.length; i++){
            assertMinOfArray(input[i], output[i]);
        }
    }

    @Test
    void testFindMax(){
        int[][] input = {{1, 2, 3, 4, 5},
                {-1, -2, -3, -4, -5},
                {0, 0, 0, 0, 0, 0, 0},
                {-1, 2, -3, 4, -5}};
        int[] output = {5, -1, 0, 4};
        for (var i = 0; i < output.length; i++){
            assertMaxOfArray(input[i], output[i]);
        }
    }

    private void assertMinOfArray(int[] array, int min) {
        assertEquals(min, FindMaxAndMin.findMin(array));
    }

    private void assertMaxOfArray(int[] array, int max){
        assertEquals(max, FindMaxAndMin.findMax(array));
    }
}