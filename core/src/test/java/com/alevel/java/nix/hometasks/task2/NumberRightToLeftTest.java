package com.alevel.java.nix.hometasks.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import static org.junit.jupiter.api.Assertions.*;

class NumberRightToLeftTest {
    PrintStream sysOut = System.out;

    ByteArrayOutputStream baOut;
    PrintStream out;
    NumberRightToLeft numberRightToLeft;

    @BeforeEach
    void setUp(){
        baOut = new ByteArrayOutputStream();
        out = new PrintStream(baOut);
        System.setOut(out);
        numberRightToLeft = new NumberRightToLeft();
    }
    @Test
    public void testNumberRightToLeft() throws IOException {

        long[] input = {347_693_485L, 1_232_222_111L, 122_123_794L, 999_999L, 0L};
        String[] output = {"fizzfizzbuzzbuzzfizzfizzbuzz",
                "fizzfizzfizzfizzbuzzfizz",
                "fizzbuzzbuzzfizzfizzfizz",
                "buzzbuzzbuzzbuzzbuzzbuzz",
                ""};

        String s;
        for (var i = 0; i < input.length; i++){
            numberRightToLeft.check(input[i]);
            s = baOut.toString("UTF-8");
            baOut.reset();
            assertNumberRightToLeft(output[i], s);
            baOut.close();
        }

    }

    void assertNumberRightToLeft(String expected, String value){
        assertEquals(expected, value);
    }

}