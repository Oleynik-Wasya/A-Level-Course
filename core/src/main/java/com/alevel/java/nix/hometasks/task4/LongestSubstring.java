package com.alevel.java.nix.hometasks.task4;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int res = 0;
        Set<Character> uniques = new HashSet<>();
        for (int i = 0, length = s.length(); i < length; i++) {
            if (uniques.add(s.charAt(i))) {
                count++;
            } else {
                if (res < count) {
                    res = count;
                }
                count--;
            }
        }
        return res;
    }
}
