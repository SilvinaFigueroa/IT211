import java.util.ArrayList;

public class storageClass implements storageInterface {

    // Variable to initialize an array list of string that will be a pocket
    ArrayList<String> pockets = new ArrayList<String>();

    // Constructor - how I want to initialize my class object -

    storageClass() {

    }

    // The interface got us the methods we need to implement, and we are going to
    // override them and create the body for each one.

    @Override
    public void addItem(String itemName) {
        pockets.add(itemName);

    }

    @Override
    public void removeItem(String itemName) {

        int itemIndex = pockets.indexOf(itemName);

        if (itemIndex != -1) {
            pockets.remove(itemIndex);

            System.out.println(itemName + " removed from pocket ");
        }

        else {

            System.out.println(itemName + " not found in any pocket");
        }

    }

    @Override
    public void printItems() {
        // For each loop to print out the items in the pocket -
        for (String itemName : pockets) {
            if (itemName != "empty")
                System.out.println(itemName);
        }

    }

    @Override
    public int getNumItems() {
        return pockets.size();
    }

}
