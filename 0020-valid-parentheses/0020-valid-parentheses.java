class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracket = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                bracket.push(s.charAt(i));
            } else if (c == ')' || c == '}' || c == ']') {
                if (bracket.isEmpty())
                    return false;
                else {
                    char top = bracket.peek();
                    if ((top == '(' && c == ')') || (top == '{' && c == '}') || (top == '[' && c == ']'))
                        bracket.pop();
                    else
                        return false;
                }

            } else {
                break;
            }
        }
        if (bracket.isEmpty())
            return true;
        else
            return false;
    }
}