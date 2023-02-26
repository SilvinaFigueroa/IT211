


public class animal{

    private String name;
    private int age;

    public animal(String name, int age){
        this.age = age;
        this.name = name;

    }

}

    class dog extends animal{

       public dog(String name, int age) {
            super(name, age);
        }

        void bark() {
            System.out.println("woof woof woof");

        }


    }

    class JindoDog extends dog{

        String oring;

       public  JindoDog(String name, int age, String orign) {
            super(name, age);
          
        }


    

    public static void main (String [] args){

        JindoDog myDog = new JindoDog("doggy", 5, "corgui");
    
             myDog.bark();


    }

}



