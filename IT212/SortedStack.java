import java.util.Stack;

public class SortedStack {

    Stack<Integer> stack = new Stack<>();

    // Write a method named isSorted accepts a stack of integers as a parameter and
    // returns true if the elements in the stack occur in ascending (non-decreasing)
    // order from top to bottom, else false


    public static void main (String args[]){

        Stack<Integer> stackPro = new Stack<>();

        stackPro.add(10);
        stackPro.add(10);
        stackPro.add(10);
        stackPro.add(10);
        stackPro.add(10);

        System.out.println(stackPro);

        isSorted(stackPro);
        
    }

    public static boolean isSorted(Stack<Integer> stack) {

        Stack<Integer> stackAux = new Stack<>();

        if (stack.isEmpty() == true || stack.size() == 1){
            System.out.println(stack + " True");
            return true;
        }

        else{

        stackAux.addAll(stack);

        int lastInt = stackAux.peek();
        stackAux.pop();
        int counter = stackAux.size();

        while (counter != 0)

            if (lastInt <= stackAux.peek()) {
                lastInt = stackAux.peek();
                stackAux.pop();
                counter --;
            } else {
                System.out.println(stack + " False");
                return false;

            }
        System.out.println(stack + " True");
        return true ;
    }

    }

}
