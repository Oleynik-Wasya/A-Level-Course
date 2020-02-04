package com.alevel.java.nix.hometasks.task1;

import java.util.Arrays;

public class HomeTask1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (var i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        FindMaxAndMin findMaxAndMin = new FindMaxAndMin();
        int max = findMaxAndMin.findMax(array);
        int min = findMaxAndMin.findMin(array);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        SortBubble sortBubble = new SortBubble();
        sortBubble.sort(array);
        for (var i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            ;
        }
        System.out.println();
        PowerOf powerOf = new PowerOf();
        System.out.println(Arrays.toString(powerOf.arrayPowerOf(array, 2)));
        ;
    }
}
