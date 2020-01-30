package com.alevel.java.nix.hometask1;

public class PowerOf {
    public static int[] arrayPowerOf(int[] array, int k){
        int count = 0;
        for (var i = 0; i < array.length; i++){
            if (array[i] % k == 0){
                count++;
            }
        }
        int[] rez = new int[count];
        int j = 0;
        for (var i = 0; i < array.length; i++){
            if (array[i] % k == 0){
                rez[j] = array[i];
                j++;
            }
        }
        return rez;
    }
}
