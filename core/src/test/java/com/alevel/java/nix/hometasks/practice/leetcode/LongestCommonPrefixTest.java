package com.alevel.java.nix.hometasks.practice.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    LongestCommonPrefix lcp;

    @BeforeEach
    void setUp(){
        lcp = new LongestCommonPrefix();
    }

    @Test
    void testLongestCommonPrefix(){
        assertPrefix("fl", lcp.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertPrefix("", lcp.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        assertPrefix("people", lcp.longestCommonPrefix(new String[]{"people","people","people"}));
        assertPrefix("", lcp.longestCommonPrefix(new String[]{"","",""}));
        assertPrefix("hel", lcp.longestCommonPrefix(new String[]{"help","hello","hell"}));
    }

    void assertPrefix(String expected, String got){
        assertEquals(expected, got);
    }

}