import java.util.Stack;

import javax.print.event.PrintEvent;

public class RemoveMinStack {

    public static void main(String[] args) {

        Stack<Integer> stackPro = new Stack<>();

        stackPro.add(10);
        stackPro.add(9);
        stackPro.add(1);
        stackPro.add(7);
        stackPro.add(6);

        System.out.println(stackPro);

        removeMin(stackPro);

    }

    public static int removeMin(Stack<Integer> stack) {

        Stack<Integer> stackAux = new Stack<>();

        // create an auxiliary stack with the elements of the stack passed as parameter
        stackAux.addAll(stack);
        Integer smallest = -1;

        if (stack.size() == 1) {
            smallest = stack.peek();
            stack.pop();
            return smallest;
        }

        Integer last = stackAux.peek();
        stackAux.pop();
        int counter = stackAux.size();

        while (counter != 0) {
            if (last < stackAux.peek()) {
                smallest = last;
                stackAux.pop();
                counter--;
            } else {
                smallest = stackAux.peek();
                last = stackAux.peek();
                stackAux.pop();
                counter--;
            }

        }

        Stack<Integer> cleanStack = new Stack<>();
        int counterAux = stack.size();

        while (counterAux != 0) {
            if (stack.peek() != smallest) {
                cleanStack.add(stack.peek());
                stack.pop();
                counterAux--;
            } else {
                stack.pop();
                counterAux--;
            }
        }

        while (cleanStack.size() != 0){
            stack.add(cleanStack.peek());
            cleanStack.pop();
        }

  
        System.out.println("Clean " + cleanStack);

        System.out.println("Smallest " + smallest);
        System.out.println("Stack" + stack);
        return smallest;

    }

}
