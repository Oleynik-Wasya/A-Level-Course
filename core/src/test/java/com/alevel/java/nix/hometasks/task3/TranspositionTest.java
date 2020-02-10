package com.alevel.java.nix.hometasks.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TranspositionTest {

    Transposition transposition;

    @BeforeEach
    void setUp() {
        transposition = new Transposition();
    }

    @Test
    void testTranspose() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        transposition.transpose(a);
        assertMatrix(new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}, a);

        int[][] a1 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        transposition.transpose(a1);
        assertMatrix(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, a1);

        int[][] a2 = {{-5, 0, 3}, {6, -5, -6}, {-7, -8, -9}};
        transposition.transpose(a2);
        assertMatrix(new int[][]{{-5, 6, -7}, {0, -5, -8}, {3, -6, -9}}, a2);
    }

    void assertMatrix(int[][] expected, int[][] got) {
        assertTrue(Arrays.deepEquals(expected, got));
    }

}