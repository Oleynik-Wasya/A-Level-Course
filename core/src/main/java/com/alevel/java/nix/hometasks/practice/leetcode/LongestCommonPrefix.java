package com.alevel.java.nix.hometasks.practice.leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        int length = smallestString(strs);
        int i;
        int j;
        for (i = 0; i < length; i++){
            for (j = 0; j < strs.length - 1; j++){
                if (strs[j].charAt(i) != strs[j+1].charAt(i)){
                    return res.toString();
                }
            }
            res.append(strs[j].charAt(i));
        }
        return res.toString();
    }

    private int smallestString(String[] strs){
        int length = strs[0].length();
        for (String s : strs) {
            if (s.length() < length){
                length = s.length();
            }
        }
        return length;
    }
}
