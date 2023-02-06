
import java.util.*;

public class percentage_gpa_switch{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade:");
        String gpa = input.next();

        input.close();

        String percentage = "Please, check your GPA grade input. It should be a value between 4.0 and 1.0";

        switch (gpa) {

            case "4.0":
            percentage = "Your percentage is from 100% to 95%"; 

            break;

            case "3.9":
            percentage = "Your percentage is between 95% to 94%"; 
            break;

            case "3.8":
            percentage = "Your percentage is between 95% to 94%"; 
            break;








    }

            System.out.println(percentage);

    }

}

