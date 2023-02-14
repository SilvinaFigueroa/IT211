
import java.util.*;

public class gpa_simplify {
    public static void main(String[] args) {

        int baseGPA = 40; // 4.0 * 10 
        int basePercentage = 95;
        int minPercentage = 0;
        int maxPercentage = 0;
        
        // User input (String)

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your GPA grade (from 4.0 to 1.0 or if you GPA is zero just add 0.0):");
        String gpa = input.next();

        // Casting string into an Int to be used in the equation
        double userGpa = Double.valueOf(gpa) *10;
        int intGpa = (int)userGpa;

        input.close();

        // Input validation for values outside the GPA range
        if (intGpa > 40 || intGpa < 0){
        System.out.println("Please, check your GPA grade input. It should be a value between 4.0 and 1.0 (please follow the format #.#");

        }
        switch (gpa) {

            case "4.0":
            System.out.println("Your percentage range is from 100% to 95%");
                break;

            case "0.0":
            System.out.println ("Your percentage range is from 65% to 0%");
                break;

            default:
                break;        
            }

            minPercentage = basePercentage - (baseGPA - intGpa);
            maxPercentage = minPercentage + 1;

            System.out.println("Your percentage range is from " + maxPercentage + "% to " + minPercentage + "%");

        }


    }



