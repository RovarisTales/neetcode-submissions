class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            Boolean isClosing = isClosing(c);
            if(stack.isEmpty() && isClosing) {
                return false;
            } 
            if (isClosing) {
                Character open = stack.pop();
                if(!match(open, c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    private Boolean isClosing(Character c) {
        return (c == '}' || c == ']' || c == ')');
    }

    private Boolean match(Character open, Character close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }
} 
