package com.alevel.java.nix.hometasks.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NumberLeftToRightTest {
    PrintStream sysOut = System.out;

    ByteArrayOutputStream baOut;
    PrintStream out;
    NumberLeftToRight numberLeftToRight;

    @BeforeEach
    void setUp() {
        baOut = new ByteArrayOutputStream();
        out = new PrintStream(baOut);
        System.setOut(out);
        numberLeftToRight = new NumberLeftToRight();
    }

    @Test
    public void testNumberLeftToRight() throws IOException {

        long[] input = {347_693_485L, 1_232_222_111L, 122_123_794L, 999_999L, 0L};
        String[] output = {"buzzfizzfizzbuzzbuzzbuzzfizzfizz",
                "fizzbuzzfizzfizzfizzfizz",
                "fizzfizzfizzbuzzbuzzfizz",
                "buzzbuzzbuzzbuzzbuzzbuzz",
                "fizzbuzz"};

        String s;
        for (var i = 0; i < input.length; i++) {
            numberLeftToRight.check(input[i]);
            s = baOut.toString("UTF-8");
            baOut.reset();
            assertNumberLeftToRight(output[i], s);
            baOut.close();
        }

    }

    void assertNumberLeftToRight(String expected, String value) {
        assertEquals(expected, value);
    }

}