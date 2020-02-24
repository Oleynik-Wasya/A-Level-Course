package com.alevel.java.nix.hometasks.practice.recursion;

public class BinomialCoef {
    public int count(int n, int m) {
        if (!(m >= 0) || (m <= n)){
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return count(n - 1, m) + count(n - 1, m - 1);
    }
}
