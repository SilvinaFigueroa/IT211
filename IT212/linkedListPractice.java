public class linkedListPractice {
    public static class Node {
        private String item;
        private Node next;

    }

    public static void main(String[] args) {
        Node first = new Node();
        first.item = "be";

        Node second = new Node();
        second.item = "or";
        first.next = second;

        // Insert an item at the beginning of the list
        Node newFirst = new Node();
        newFirst.item = "to";
        newFirst.next = first; // old first now is the second 
        first = newFirst; 

        // Insert at item at the end of the list
        Node last = new Node();
        last.item = "be.";
        
        Node current = first;
        while (current != null) {
            current = current.next;
        }

        current = last;
        last.next = null; 

        // System.out.println(current.item);

        Node middle = new Node();
        middle.item = "not";
        current = first;
        String target = "be";

        while (current != null) {
            if ((current.item != null && current.item.equals(target))) {
                Node oldNext = current.next;
                current.next = middle;
                middle.next = oldNext;
                break;
            }
            current = current.next;

        }

        current = first;
        while (current != null) {
            System.out.println(current.item);
            current = current.next;
        }
    }

}
