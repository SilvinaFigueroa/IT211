
import java.lang.Math;

public class StartString {
    public static void main(String[] args) {
        System.out.println(starString(0).length());
        System.out.println(starString(1).length());
        System.out.println(starString(2).length());
        System.out.println(starString(3).length());
        System.out.println(starString(4).length());

    }


    
    public static String starString(int n){
    
    double power =  Math.pow(2, n - 1) ;

        if (n < 0 ) {
            throw new IllegalArgumentException("Input needs to be greater than 1");
        }

        else if (n == 0){
            return "*";
        }

        else{

            String asterisk = "*";
            String star = asterisk.repeat((int)power) + starString(n - 1);
            return star;
            
        }

    }   
    
}
