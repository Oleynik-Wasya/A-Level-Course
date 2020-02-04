package com.alevel.java.nix.hometasks.task2;

public class CountBitsEqualOne {
    public int count(long value){
        int counter = 0;
        while (value != 0){
            if (value % 2 != 0){
                counter++;
            }
            value >>>= 1;
        }
        return counter;
    }
}
