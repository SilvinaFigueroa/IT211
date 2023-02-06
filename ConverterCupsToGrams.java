
class ConverterCupsToGrams{
    public static void main (String [] args){
        //Declate variables 
        double numberGrams;
        double numberCups;

        // Number of cups to be converter into grams 
        numberCups = 3.0/4;

        // Equation with the equivalent grams 
        numberGrams = numberCups * 240;

        //Print result 
        System.out.println(
            "The equivalent of " + numberCups + " cups in grams is " + numberGrams + " grs.");   

    }
}