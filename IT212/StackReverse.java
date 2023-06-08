import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackReverse {

    Stack<Integer> stack = new Stack<>();

    public static void main(String args[]) {

        Stack<Integer> stackPro = new Stack<>();

        stackPro.add(10);
        stackPro.add(9);
        stackPro.add(5);
        stackPro.add(15);
        stackPro.add(13);

        System.out.println(stackPro);

        reverse(stackPro);
    }

    public static Stack reverse(Stack<Integer> stack) {

        Queue<Integer> queueAux = new LinkedList<>();

        while (stack.size() != 0) {
            queueAux.offer(stack.peek());
            stack.pop();
        }

        System.out.println(queueAux);
        stack.addAll(queueAux);

        return stack;

    }   

}
