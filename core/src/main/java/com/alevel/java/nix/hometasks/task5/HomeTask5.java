package com.alevel.java.nix.hometasks.task5;

public class HomeTask5 {
    public static void main(String[] args) {
        String s = "hello world!";
        System.out.println(s);
        ReverseCharSequence rcs = new ReverseCharSequence();
        String reversed = rcs.reverse(s).toString();
        System.out.println(reversed);
    }
}
