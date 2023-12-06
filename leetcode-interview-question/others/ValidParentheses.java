package others;
import java.util.Stack;

public class ValidParentheses {
    private Stack<Character> stack = new Stack<>();
    public boolean isValid(String s) {
        for(char ch: s.toCharArray()){
            // check ch
            switch (ch)
            {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                    break;
            }
        }

        return stack.isEmpty();
    }    
}
