package com.alevel.java.nix.hometasks.task4;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int currentArea;
        for (int i = 0, length = height.length; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                currentArea = Math.min(height[i], height[j]) * (j - i);
                if (maxArea < currentArea) {
                    maxArea = currentArea;
                }
            }
        }
        return maxArea;
    }
}
