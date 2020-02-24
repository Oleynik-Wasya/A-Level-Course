package com.alevel.java.nix.hometasks.practice.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

    MedianOfTwoSortedArrays motsa;

    @BeforeEach
    void setUp(){
        motsa = new MedianOfTwoSortedArrays();
    }

    @Test
    void testMedianOfTwoSortedArrays(){
        assertMedian(4.5, motsa.find(new int[]{1,4,6}, new int[]{2,5,100}));
        assertMedian(2.0, motsa.find(new int[]{1,3}, new int[]{2}));
        assertMedian(3.0, motsa.find(new int[]{1,2,3}, new int[]{4,5}));
        assertMedian(1.0, motsa.find(new int[]{1}, new int[]{1}));
    }

    void assertMedian(double expected, double got){
        assertEquals(expected, got);
    }
}