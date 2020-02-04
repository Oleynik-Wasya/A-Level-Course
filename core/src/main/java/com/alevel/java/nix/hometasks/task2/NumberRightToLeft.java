package com.alevel.java.nix.hometasks.task2;

import java.io.PrintStream;
import java.io.PrintWriter;

public class NumberRightToLeft {
    public void check(long value) {
        long current;
        while (value != 0) {
            current = value % 10;
            if ((current) % 2 == 0) {
                System.out.print("fizz");
            } else if ((current) % 3 == 0) {
                System.out.print("buzz");
            }
            value /= 10;
        }

    }
}
