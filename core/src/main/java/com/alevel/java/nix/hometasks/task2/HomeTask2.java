package com.alevel.java.nix.hometasks.task2;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class HomeTask2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        int value = 347_693_485;
        NumberLeftToRight numberLeftToRight = new NumberLeftToRight();
        numberLeftToRight.check(value);
        System.out.println();
        NumberRightToLeft numberRightToLeft = new NumberRightToLeft();
        numberRightToLeft.check(value);
        System.out.println();



        CountBitsEqualOne countBitsEqualOne = new CountBitsEqualOne();
        System.out.println(countBitsEqualOne.count(347_693_485L));
    }
}
