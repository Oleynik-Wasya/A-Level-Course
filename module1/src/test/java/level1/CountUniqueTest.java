package level1;

import level1.CountUnique;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountUniqueTest {

    CountUnique countUnique;

    @BeforeEach
    void setUp() {
        countUnique = new CountUnique();
    }

    @Test
    void testCountUnique() {
        assertCount(3, countUnique.count(new int[]{1, 2, 3, 1, 2, 3, 1, 2, 3}));
        assertCount(0, countUnique.count(new int[]{}));
        assertCount(1, countUnique.count(new int[]{1}));
        assertCount(5, countUnique.count(new int[]{1, 2, 3, 4, 5, 5}));
    }

    void assertCount(int expected, int got) {
        assertEquals(expected, got);
    }
}