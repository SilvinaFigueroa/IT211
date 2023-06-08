

public class RecursionPractice {
    public static void main(String[] args) {
        countToBy(4, 1);

    }

    // Write a recursive method named countToBy that accepts integer parameters n
    // and m and that produces
    // output indicating how to count to n in increments of m separated by commas.
    // For example, to count to 10 by 1
    // you'd say countToBy(10, 1);

public static void countToBy(int until, int by) {
    
    if (until < 1 || by < 1) {
        throw new IllegalArgumentException("Input needs to be than 1");
    
    } else if (until <= by) {
        System.out.print(until);
    
    } else {    
        countToBy(until - by, by);
        System.out.print(", " + until);

    }
}

}

