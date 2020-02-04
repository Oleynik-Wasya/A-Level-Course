package com.alevel.java.nix.hometasks.task1;

public class SortBubble {
    public int[] sort(int[] array) {
        int[] res = array.clone();
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < res.length - 1; i++) {
                if (res[i] > res[i + 1]) {
                    isSorted = false;

                    buf = res[i];
                    res[i] = res[i + 1];
                    res[i + 1] = buf;
                }
            }
        }
        return res;
    }
}
