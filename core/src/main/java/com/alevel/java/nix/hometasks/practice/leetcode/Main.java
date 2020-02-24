package com.alevel.java.nix.hometasks.practice.leetcode;

public class Main {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"people","people","people"}));

        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        System.out.println(medianOfTwoSortedArrays.find(new int[]{1,4,6}, new int[]{2,5,100}));
    }
}
