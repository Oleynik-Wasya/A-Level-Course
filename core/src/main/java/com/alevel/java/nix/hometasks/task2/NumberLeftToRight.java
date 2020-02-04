package com.alevel.java.nix.hometasks.task2;

import java.io.PrintStream;
import java.io.PrintWriter;

public class NumberLeftToRight {
    public void check(long value) {
        int lengthOfValue = getCountsOfDigits(value);
        long current;
        while (value > 0) {
            current = value / (int) Math.pow(10, --lengthOfValue);
            if ((current) % 2 == 0) {
                System.out.print("fizz");
            }
            if ((current) % 3 == 0) {
                System.out.print("buzz");
            }
            value = (value % (int) Math.pow(10, lengthOfValue));
        }
    }

    private static int getCountsOfDigits(long number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
