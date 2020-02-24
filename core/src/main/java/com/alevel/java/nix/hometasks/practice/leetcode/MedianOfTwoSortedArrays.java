package com.alevel.java.nix.hometasks.practice.leetcode;

public class MedianOfTwoSortedArrays {
    public double find(int[] nums1, int[] nums2){
        int length  = nums1.length + nums2.length;
        int[] merged = new int[nums1.length + nums2.length];
        int f = 0;
        int s = 0;
        for (int i = 0; i < merged.length; i++){
            if (f >= nums1.length){
                merged[i] = nums2[s];
                s++;
                continue;
            }
            if (s >= nums2.length){
                merged[i] = nums1[f];
                f++;
                continue;
            }
            if (nums1[f] < nums2[s]){
                merged[i] = nums1[f];
                f++;
            }else {
                merged[i] = nums2[s];
                s++;
            }
        }
        if (merged.length % 2 != 0){
            return merged[merged.length / 2];
        } else{
            return (merged[merged.length / 2] + merged[merged.length / 2 - 1]) / 2.0;
        }
    }
}
