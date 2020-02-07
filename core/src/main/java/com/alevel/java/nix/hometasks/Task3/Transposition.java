package com.alevel.java.nix.hometasks.Task3;

public class Transposition {
    public void transpose(int[][] array) {
         for (int i = 0, length = array.length; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }
}
