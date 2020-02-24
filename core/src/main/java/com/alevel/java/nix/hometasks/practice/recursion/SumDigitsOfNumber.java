package com.alevel.java.nix.hometasks.practice.recursion;

public class SumDigitsOfNumber {
    public int count(int number){
        if (number < 10){
            return number;
        }
        return number % 10 + count(number / 10);
    }
}
