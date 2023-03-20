import java.util.Arrays;

public class storageClass implements storageInterface {

    // Variable to initialize an array of string that will be a pocket
    private String pockets[] = new String[5];

    // Constructor - how I want to initialize my class object -

    storageClass() {
        // initialize the array by filling it with empty strings -
        Arrays.fill(pockets, "empty");

    }

    // The interface got us the methods we need to implement, and we are going to
    // override them and create the body for each one.

    @Override
    public void addItem(String itemName) {
        int itemIndex = -1;

        for (int index = 0; index < pockets.length; index++) {
            if (pockets[index] == "empty") {
                itemIndex = index;
                break;
            }
        }

        if (itemIndex != -1) {
            pockets[itemIndex] = itemName;
            System.out.println(itemName + " was added to the pocket " + (itemIndex + 1));
        }

        else {

            System.out.println("The 4D Pocket is full, sorry...we couldn't add " + itemName);
        }

    }

    @Override
    public void removeItem(String itemName) {
        
        int itemIndex = -1;

        for (int index = 0; index < pockets.length; index++) {
            if (pockets[index] == itemName) {
                itemIndex = index;
                break;
            }
        }

        if (itemIndex != -1) {
            pockets[itemIndex] = "empty";
            System.out.println(itemName + " removed from pocket " + (itemIndex + 1));
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
        int numItems = 0;
        // Increment the numItems value every time we find an item that is not empty -
        for (int i = 0; i < pockets.length; i++) {
            if (pockets[i] != "empty") {
                numItems = numItems + 1;
            }
            // the method in the interface set this returt to an int, so we can't add a
            // print statement
        }
        return numItems;
    }

}
