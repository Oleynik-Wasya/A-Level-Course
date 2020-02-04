package com.alevel.java.nix.hometasks.task2;

public class NumberLeftToRight {
    public void check(long value) {
        if (value == 0) {
            System.out.print("fizzbuzz");
            return;
        }
        StringBuilder result = new StringBuilder();
        int lengthOfValue = getCountsOfDigits(value);
        long current;
        while (value > 0) {
            current = value / (int) Math.pow(10, --lengthOfValue);
            if ((current) % 2 == 0) {
                result.append("fizz");
            }
            if ((current) % 3 == 0) {
                result.append("buzz");
            }
            value = (value % (int) Math.pow(10, lengthOfValue));
        }
        System.out.print(result);
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
