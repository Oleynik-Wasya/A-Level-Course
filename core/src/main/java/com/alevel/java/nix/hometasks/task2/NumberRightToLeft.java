package com.alevel.java.nix.hometasks.task2;

public class NumberRightToLeft {
    public void check(long value) {
        if (value == 0) {
            System.out.print("fizzbuzz");
            return;
        }
        StringBuilder result = new StringBuilder();
        long current;

        while (value != 0) {
            current = value % 10;
            if ((current) % 2 == 0) {
                result.append("fizz");
            } else if ((current) % 3 == 0) {
                result.append("buzz");
            }
            value /= 10;
        }
        System.out.print(result);
    }
}
