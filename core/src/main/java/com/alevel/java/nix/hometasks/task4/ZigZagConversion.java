package com.alevel.java.nix.hometasks.task4;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        StringBuilder res = new StringBuilder();
        int range = 2 * numRows - 3;
        int currentRangeBefore = range;
        int currentRangeAfter = range;

        for (int i = 0; i < numRows; i++) {
            int j = i;
            int k = 0;
            while (j < s.length()) {
                res.append(s.charAt(j));
                if (k % 2 == 0) {
                    j += currentRangeBefore + 1;
                } else {
                    j += currentRangeAfter + 1;
                }
                k++;
            }
            if (currentRangeBefore - 2 < 0) {
                currentRangeBefore = range;
            } else {
                currentRangeBefore -= 2;
            }

            currentRangeAfter = range - (currentRangeBefore + 1);
            if (currentRangeAfter < 0) {
                currentRangeAfter = range;
            }
        }

        return res.toString();
    }
}
