package com.alevel.java.nix.hometasks.practice.recursion;

public class CountDigitsOfNumber {
    public int count(int number){
        if (number < 10){
            return 1;
        }
        return 1 + count(number / 10);
    }
}
