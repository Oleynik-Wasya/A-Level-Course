package level2;

import java.util.ArrayDeque;

public class Bracket {
    public boolean isBracketsPossible(String s) {
        if (s.isEmpty()) return true;

        var stack = new ArrayDeque<Character>();

        for (int i = 0, length = s.length(); i < length; i++) {
            char current = s.charAt(i);
            switch (current) {
                case '{':
                case '[':
                case '(':
                    stack.push(current);
                    break;
                case ']':
                    if (stack.isEmpty() || stack.poll() != '[') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.poll() != '{') return false;
                    break;
                case ')':
                    if (stack.isEmpty() || stack.poll() != '(') return false;
                    break;
            }
        }

        return stack.isEmpty();
    }
}
