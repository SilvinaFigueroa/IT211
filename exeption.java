

class exeption {
    
    public static void main (String []args){
        int [] nums = new int [5];


    try{

        System.out.println("In try 1");
        nums [10] = 25; 

        //After the error (array out of bound) the rest of the try block stop and goes directly to the catch
        System.out.println("In try 2");

    }   

    catch (Exception ex) {

        System.out.println("Catching error");
    } 

    System.out.println("Rest of the program executes");


    }



}