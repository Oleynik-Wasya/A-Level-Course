package com.alevel.java.nix.hometasks.task2;

public class HomeTask2 {
    public static void main(String[] args) {
        int value = 0;
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
