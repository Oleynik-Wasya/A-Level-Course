package com.alevel.java.nix.hometasks.practice.recursion;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        SumDigitsOfNumber sdon = new SumDigitsOfNumber();
        System.out.println(sdon.count(999));

        CountDigitsOfNumber cdon = new CountDigitsOfNumber();
        System.out.println(cdon.count(123411111));

        BinomialCoef bc = new BinomialCoef();
        System.out.println(bc.count(1,2));
    }
}
