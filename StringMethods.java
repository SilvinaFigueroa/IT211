import java.util.*;

public class StringMethods {
    public static void main(String args[]) {

        // String myString = "";

        
        Scanner sc = new Scanner(System.in);
        String myString = sc.next();

        sc.close();

        // convert String to character array by using toCharArray
        char[] reverse = myString.toCharArray();
       
        String newPass = "";

        // take each character of the string from back to top and add it in a new string
        for (int i = reverse.length - 1; i >= 0; i--){
                newPass += (reverse[i]); 

        }

        // Replace vowels for numnbers and special characters
        newPass = newPass.replace('a', '@');
        newPass = newPass.replace('e', '3');
        newPass = newPass.replace('i', '1');
        newPass = newPass.replace('o', '_');
        newPass = newPass.replace('u', ')');


        System.out.println(newPass);

    }
}
