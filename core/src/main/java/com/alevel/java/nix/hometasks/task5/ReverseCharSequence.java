package com.alevel.java.nix.hometasks.task5;

public class ReverseCharSequence {

    public CharSequence reverse(CharSequence origin) {
        return new CharSequenceReversed(origin);
    }

    private class CharSequenceReversed implements CharSequence {
        private CharSequence origin;

        CharSequenceReversed(CharSequence charSequence) {
            this.origin = charSequence;
        }

        public String toString() {
            return new StringBuilder(this).toString();
        }

        @Override
        public int length() {
            return origin.length();
        }

        @Override
        public char charAt(int index) {
            return origin.charAt(origin.length() - index - 1);
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            int originalEnd = origin.length() - start;
            int originalStart = origin.length() - end;
            return new CharSequenceReversed(
                    origin.subSequence(originalStart, originalEnd));
        }
    }
}
