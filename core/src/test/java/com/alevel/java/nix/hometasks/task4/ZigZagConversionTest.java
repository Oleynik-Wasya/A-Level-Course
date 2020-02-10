package com.alevel.java.nix.hometasks.task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagConversionTest {
    ZigZagConversion zigZagConversion;

    @BeforeEach
    void setUp() {
        zigZagConversion = new ZigZagConversion();
    }

    @Test
    void testZigZagConversion() {
        assertConvert(zigZagConversion.convert("PAYPALISHIRING", 3), "PAHNAPLSIIGYIR");
        assertConvert(zigZagConversion.convert("PAYPALISHIRING", 4), "PINALSIGYAHRPI");
        assertConvert(zigZagConversion.convert("HELLOWORLD", 5), "HLERDLOLWO");
    }

    void assertConvert(String got, String expected) {
        assertEquals(expected, got);
    }
}