package com.alevel.java.nix.hometasks.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.*;

class TeslaBuyerTest {
    TeslaBuyer teslaBuyer;

    @BeforeEach
    void setUp() {
        teslaBuyer = new TeslaBuyer();
    }

    @Test
    void testTeslaBuyer() {
        assertProfit(new DayOfWeek[]{DayOfWeek.THURSDAY, DayOfWeek.SUNDAY}, teslaBuyer.profit(new double[]{111.1, 998.3, 343.5, 0.8, 99.99, 9.8, 2000.0}));
        assertProfit(new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY}, teslaBuyer.profit(new double[]{0.1, 2.3, 100000.5, 0.11, 80.99, 9.8, 200.0}));
        assertProfit(new DayOfWeek[]{DayOfWeek.SATURDAY, DayOfWeek.SUNDAY}, teslaBuyer.profit(new double[]{1000.9, 0.9, 666.66, 999.99, 56.8, 0.1, 2000.0}));
        assertProfit(new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.MONDAY}, teslaBuyer.profit(new double[]{100.1, 100.1, 100.1, 100.1, 100.1, 100.1, 100.1}));
        assertProfit(new DayOfWeek[]{DayOfWeek.WEDNESDAY, DayOfWeek.SATURDAY}, teslaBuyer.profit(new double[]{900.1, 909.1, 50.1, 58.1, 71.1, 75.1, 0.2}));
    }

    void assertProfit(DayOfWeek[] expected, DayOfWeek[] got) {
        assertArrayEquals(expected, got);
    }
}