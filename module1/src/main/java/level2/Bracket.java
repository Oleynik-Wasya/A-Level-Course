package level2;

import java.util.HashMap;
import java.util.Stack;

public class Bracket {
    boolean isBracketsPossible(String s){
        if (s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('{', '}');
        brackets.put('(', ')');
        brackets.put('[', ']');
        char[] charArray = s.toCharArray();
        int i = 0;
        while (!brackets.containsValue(charArray[i])){
            stack.add(charArray[i]);
            i++;
        }
        while (!stack.empty()){
            if (brackets.get(stack.pop()) != charArray[i]){
                return false;
            }
            i++;
        }
        if (i != charArray.length){
            return false;
        }
        return true;
    }
}
