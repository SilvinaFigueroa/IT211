import java.util.ArrayList;

public class BoxClass {

    // default values of variables = null
    private double width;
    private double height;
    private double depth;

    // Define items as an arrayList of Strings
    private ArrayList<String> items;
    private int maxSize = 9;

    public BoxClass(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.items = new ArrayList<String>(10);

    }

    public double volume() {
        double boxVolume = this.width * this.height * this.depth;
        return boxVolume;

    }

    public void printItems() {
        if (this.items.size() > 0) {
            System.out.print("\n List of items in the box: ");
            for (int i = 0; i < this.items.size(); i++) {
                System.out.print(this.items.get(i) + " ");
            }
        } else {
            System.out.println("The box is empty");
        }

    }

    public void addItem(String item) {
    //    System.out.println(items.size());
        if (items.size() <= maxSize)
            items.add(item);

        else {
            System.out.println("The box is full. Max size set to :" + maxSize);
        }

    }

    public void removeItem(String item) {
        if (this.items.contains(item)) {
            items.remove(item);

        }

        else {
            System.out.println("The item " + item + " does not exist in the box");

        }

    }

    public void removeAll(BoxClass box) {
    }

}