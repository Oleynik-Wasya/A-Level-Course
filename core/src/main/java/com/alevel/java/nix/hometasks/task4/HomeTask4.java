package com.alevel.java.nix.hometasks.task4;

public class HomeTask4 {
    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println(longestSubstring.lengthOfLongestSubstring(""));

        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int maxArea = containerWithMostWater.maxArea(new int[]{8, 8});
        System.out.println(maxArea);

        ZigZagConversion zigZagConversion = new ZigZagConversion();
        System.out.println(zigZagConversion.convert("HELLOWORLD", 5));
        System.out.println("PINALSIGYAHRPI");
    }
}
