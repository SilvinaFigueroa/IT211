

public class list extends LinkedIntList{
  
    public static void main(String[] args) {
        
        LinkedIntList newList = new LinkedIntList();

        newList.add(0, 1);
        newList.add(1, 18);
        newList.add(2, 2);
        newList.add(3, 7);
        newList.add(4, 18);
        newList.add(5, 39);
        newList.add(6, 18);
        newList.add(7, 40);
        newList.add(8, -1);
        newList.remove(8);
        newList.add(8, 9);

        // newList.lastIndexOf(18);

        // System.out.println(newList.min());
        System.out.println(newList.toString());
        newList.reverse();
        System.out.println(newList.toString());

    }

}
