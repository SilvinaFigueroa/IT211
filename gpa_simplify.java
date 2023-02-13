

import java.util.*;

public class gpa_simplify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your GPA grade (from 4.0 to 1.0 or if you GPA is zero just add 0.0):");
        String gpa = input.next();

        input.close();

        String percentageRange = "Please, check your GPA grade input. It should be a value between 4.0 and 1.0 (please follow the format #.#)";

        switch (gpa) {

            case "4.0":
                percentageRange = "Your percentageRange is from 100% to 95%";
                break;

            default 

