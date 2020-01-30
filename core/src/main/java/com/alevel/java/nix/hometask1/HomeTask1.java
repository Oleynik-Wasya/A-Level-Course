package com.alevel.java.nix.hometask1;

import java.util.Arrays;

public class HomeTask1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (var i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int max = FindMaxAndMin.findMax(array);
        int min = FindMaxAndMin.findMin(array);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        SortBubble.sort(array);
        for (var i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");;
        }
        System.out.println();;
        System.out.println(Arrays.toString(PowerOf.arrayPowerOf(array, 2)));;
    }
}
