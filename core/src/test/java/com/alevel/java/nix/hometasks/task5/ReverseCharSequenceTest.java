package com.alevel.java.nix.hometasks.task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseCharSequenceTest {

    ReverseCharSequence reverseCharSequence;

    @BeforeEach
    void setUp(){
        reverseCharSequence = new ReverseCharSequence();
    }

    @Test
    void testReverse(){
        assertReversed(reverseCharSequence.reverse("hello world!").toString(), "!dlrow olleh");
        assertReversed(reverseCharSequence.reverse("aaaaa").toString(), "aaaaa");
        assertReversed(reverseCharSequence.reverse("abababa").toString(), "abababa");
        assertReversed(reverseCharSequence.reverse("ReVeRsE").toString(), "EsReVeR");
    }

    void assertReversed(String got, String expected){
        assertEquals(expected, got);
    }

}