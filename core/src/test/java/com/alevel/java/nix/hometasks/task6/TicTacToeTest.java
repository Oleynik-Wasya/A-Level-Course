package com.alevel.java.nix.hometasks.task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    TicTacToe ticTacToe;

    @BeforeEach
    void setUp() {
        ticTacToe = new TicTacToe();
    }

    @Test
    void testMove() {
        ticTacToe.move(0, 0, 1);
        assertGrid(new int[][]{{1, 0, 0},
                {0, 0, 0},
                {0, 0, 0}}, ticTacToe.getGrid());

        ticTacToe.move(1, 1, -1);
        assertGrid(new int[][]{{1, 0, 0},
                {0, -1, 0},
                {0, 0, 0}}, ticTacToe.getGrid());

        ticTacToe.move(1, 1, 1);
        assertGrid(new int[][]{{1, 0, 0},
                {0, -1, 0},
                {0, 0, 0}}, ticTacToe.getGrid());

        ticTacToe.move(1, 2, 1);
        assertGrid(new int[][]{{1, 0, 0},
                {0, -1, 1},
                {0, 0, 0}}, ticTacToe.getGrid());
    }

    @Test
    void testCheckWinner() {
        ticTacToe.setGrid(new int[][]{
                {1, 1, 1},
                {0, -1, 1},
                {0, 0, 0}
        });
        assertWinner(1, ticTacToe.checkWinner());

        ticTacToe.setGrid(new int[][]{
                {1, 1, -1},
                {-1, 1, 0},
                {-1, 0, 1}
        });
        assertWinner(1, ticTacToe.checkWinner());

        ticTacToe.setGrid(new int[][]{
                {-1, 1, 1},
                {0, -1, 1},
                {0, 0, -1}
        });
        assertWinner(-1, ticTacToe.checkWinner());

        ticTacToe.setGrid(new int[][]{
                {1, -1, 1},
                {1, -1, 1},
                {-1, 1, -1}
        });
        assertWinner(0, ticTacToe.checkWinner());
    }

    void assertWinner(int expected, int got) {
        assertEquals(expected, got);
    }

    void assertGrid(int[][] expected, int[][] got) {
        assertTrue(Arrays.deepEquals(expected, got));
    }


}