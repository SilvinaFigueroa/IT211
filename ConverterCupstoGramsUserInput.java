import java.util.*;

class ConverterCupsToGrams{
    public static void main (String [] args){
        //Declate variables 
        double numberGrams;
        double  numberCups;

        // User input - Cups to be converter into grams 
        Scanner input = new Scanner(System.in);
        System.out.println ("Input the amount of cups to convert into grams");
        numberCups = input.nextDouble();

        //Close Scanner
        input.close();

       // Equation with the equivalent grams 
        numberGrams = numberCups * 240;

        //Print result 
        System.out.println(
            "The equivalent of " + numberCups + " cups in grams is " + numberGrams + " grs.");   

    }
}