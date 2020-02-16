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
        int[][] exp1 = {{0, 0, 0, 0, 0,},
                {0, 1, 0, 1, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}};

        int[][] output1 = {{0, 0, 0, 0, 0,},
                {0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0}};

        gameLife.live(output1);
        assertCondition(exp1, output1);

        int[][] exp2 = {{0, 0, 0, 0, 0,},
                {0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0}};

        int[][] output2 = {{0, 0, 0, 0, 0,},
                {0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 0, 0}};

        gameLife.live(output2);
        assertCondition(exp2, output2);

        int[][] exp3 = {{0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};

        int[][] output3 = {{0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};

        gameLife.live(output3);
        assertCondition(exp3, output3);

    }

    void assertCondition(int[][] expected, int[][] got) {
        assertTrue(Arrays.deepEquals(expected, got));
    }
}