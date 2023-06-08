import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class practice {

    public static void selfcheck(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        while (!s.isEmpty()) {
            int n = s.pop();
            q.add(n);
            q.add(n);
        }
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        System.out.println(s);
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<Integer>();
        s.push(42);
        s.push(-3);
        s.push(4);
        s.push(15);
        s.push(9);

        selfcheck(s);

    }

}
