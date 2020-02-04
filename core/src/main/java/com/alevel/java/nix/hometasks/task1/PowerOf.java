package com.alevel.java.nix.hometasks.task1;

public class PowerOf {
    public int[] arrayPowerOf(int[] array, int k) {
        int count = 0;
        for (var i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                count++;
            }
        }
        int[] rez = new int[count];
        int j = 0;
        for (var i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                rez[j] = array[i];
                j++;
            }
        }
        return rez;
    }
}
