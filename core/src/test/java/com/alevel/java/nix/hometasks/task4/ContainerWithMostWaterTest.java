package com.alevel.java.nix.hometasks.task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    ContainerWithMostWater containerWithMostWater;

    @BeforeEach
    void setUp() {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @Test
    void testCounterWithMostWater() {
        assertEquals(containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49);
        assertEquals(containerWithMostWater.maxArea(new int[]{10, 8, 6, 2, 5, 4, 8, 3, 12}), 80);
        assertEquals(containerWithMostWater.maxArea(new int[]{9, 7, 1, 4, 5, 4, 5, 3, 10}), 72);
        assertEquals(containerWithMostWater.maxArea(new int[]{1, 2, 3, 4, 5, 6, 7, 8}), 16);
        assertEquals(containerWithMostWater.maxArea(new int[]{8, 8}), 8);
    }

    void assertMaxArea(int got, int expected) {
        assertEquals(expected, got);
    }

}