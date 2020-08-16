package DailyWork.ValidParentheses;

import java.util.HashMap;
import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if ('(' == (c) || '[' == (c) || '{' == (c)) {
                stack.push(c);
            }
            if (')' == (c) || ']' == (c) || '}' == (c)) {
                if(stack.empty()) return false;
                Character pop = stack.pop();
                if (pop != map.get(Character.valueOf(c))) return false;
            }
        }
        if(!stack.empty()){
            return false;
        }
        return true;
    }

}
