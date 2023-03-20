
public class doraemonPocket {
    public static void main(String[] args){

        // Create an object of the class storageClass (instantiate)
        storageClass pocket = new storageClass();

        pocket.addItem("Blue");
        pocket.addItem("Red");
        pocket.addItem("Yellow");
        pocket.addItem("Orange");
        pocket.addItem("Pink");
        pocket.addItem("White");

        pocket.removeItem("Yellow");
        pocket.removeItem("Grey");

        pocket.addItem("Black");
        pocket.addItem("Green");

        pocket.removeItem("Orange");
        pocket.removeItem("Pink");
        pocket.removeItem("White");


        pocket.printItems();
        
        System.out.println("The number of items in the pocket is " + pocket.getNumItems());

        






    }
}
