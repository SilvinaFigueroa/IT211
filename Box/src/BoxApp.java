

public class BoxApp {
    public static void main(String[] args) {
    
        BoxClass box = new BoxClass(20.5,15.2,12.2);

        System.out.println(box.volume());

        box.removeAll(box);
   

        box.addItem("blue");
        box.addItem("red");
        box.addItem("white");
        box.addItem("yellow");
        box.addItem("pink");
        box.addItem("black");
        box.addItem("green");
        box.addItem("brown");
        box.addItem("cian");
        box.addItem("grey");

        box.removeItem("pizza");
        
        box.printItems();

        box.removeItem("blue");
        box.removeItem("black");
        box.removeItem("green");

        box.printItems();

      
    }
    
}
