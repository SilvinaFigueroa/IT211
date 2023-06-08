
import java.util.Stack;

public class StacksBalance {

    public static void main(String[] args) {
        checkBalance("{({)}}");
    }


    public static int checkBalance(String sourceCode) {

        Stack<Character> stack = new Stack<>();
        Integer index = -1;

        for (char charSymbol : sourceCode.toCharArray()) {
            index++;
            if (charSymbol == '(') {
                stack.add(charSymbol);
            } else if (charSymbol == ')') {
                if (stack.isEmpty()) {
                    return index;
                } else if (stack.peek() == '('){
                    stack.pop();
                }
                else{
                    return index;
                }
            }
            else if (charSymbol == '{') {
                stack.add(charSymbol);
            } else if (charSymbol == '}') {
                if (stack.isEmpty()) {
                    return index;
                } else if (stack.peek() == '{'){
                    stack.pop();
                }
                else{
                    return index;
                }
            }
        }

        if (index + 1  == sourceCode.length() && stack.isEmpty() == true) {
            index = -1;
        }

        else if (stack.isEmpty() != true){
            index = sourceCode.length();
        }

        System.out.println(index);
        return index;
    }

}
