package level3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GameLifeTest {

    GameLife gameLife;

    @BeforeEach
    void setUp() {
        gameLife = new GameLife();
    }

    @Test
    void testGameLife() {
        int[][] next1 = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};

        int[][] initial1 = {{1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}};

        gameLife.live(initial1);
        assertCondition(next1, initial1);

        int[][] next2 = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};

        int[][] initial2 = {{0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}};

        gameLife.live(initial2);
        assertCondition(next2, initial2);

        int[][] next3 = {{0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 0},
                {0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 0}};

        int[][] initial3 = {{0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 0}};

        gameLife.live(initial3);
        assertCondition(next3, initial3);

        int[][] next4 = {{0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};

        int[][] initial4 = {{0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};

        gameLife.live(initial4);
        assertCondition(next4, initial4);
    }

    void assertCondition(int[][] expected, int[][] got) {
        assertTrue(Arrays.deepEquals(expected, got));
    }
}