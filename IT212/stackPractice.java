import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackPractice {
    
public static void main (String args[]){
    Stack<String> s = new Stack<String>();
    Queue<String> q = new LinkedList<String>();
    s.push("how");
    s.push("are");
    s.push("you");
    
    while (!s.isEmpty()) {
       q.add(s.pop());
    }
    System.out.print(q);
    
}

}
