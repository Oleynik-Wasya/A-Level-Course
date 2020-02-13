package com.alevel.java.nix.hometasks.practice.strings;

class CountWords {
    int startWith(char c, String s){
        int count = 0;

        for(String ch : s.split(" ")){
            if (ch.startsWith(String.valueOf(c))){
                count++;
            }
        }

        return count;
    }
}
