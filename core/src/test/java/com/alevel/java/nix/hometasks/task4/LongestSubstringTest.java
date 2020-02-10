package com.alevel.java.nix.hometasks.task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {

    LongestSubstring longestSubstring;

    @BeforeEach
    void setUp() {
        longestSubstring = new LongestSubstring();
    }

    @Test
    void testLongestSubstring() {
        assertLenghtOfSubstring(longestSubstring.lengthOfLongestSubstring("abcabcbb"), 3);
        assertLenghtOfSubstring(longestSubstring.lengthOfLongestSubstring("bbbbb"), 1);
        assertLenghtOfSubstring(longestSubstring.lengthOfLongestSubstring("pwwkew"), 3);
        assertLenghtOfSubstring(longestSubstring.lengthOfLongestSubstring("uuddqwertyuu"), 6);
        assertLenghtOfSubstring(longestSubstring.lengthOfLongestSubstring("aa"), 1);
    }

    public void assertLenghtOfSubstring(int got, int expected) {
        assertEquals(expected, got);
    }

}