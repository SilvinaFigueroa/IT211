public class SumOfSquares {
    public static void main(String[] args) {

        System.out.print(sumOfSquares(3));

    }

    public static int sumOfSquares (int n){
    
    double power =  Math.pow(n, 2);

        if (n < 0 ) {
            throw new IllegalArgumentException("Input needs to be greater than 1");
        }

        else if (n == 0){
            return 0;
 
        }

        else{

           
           return (int) (power + sumOfSquares(n-1));
            
        }

    }   
    
}




