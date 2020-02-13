package com.alevel.java.nix.hometasks.practice.strings;

public class Main {
    public static void main(String[] args) {
        CountWords countWords = new CountWords();
        int res = countWords.startWith('h', "hello world hell");
        System.out.println(res);
    }
}
