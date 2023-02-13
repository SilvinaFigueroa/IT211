
import java.util.*;

public class gpa_calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade:");
        double grade = input.nextDouble();

        // close scanner
        input.close();

        double gpa;

        // GPF comparison

        if (grade > 100)
            System.out.println(
                    "The grade entered is not valid, please enter a number from 0 to 100 without the % simbol ");

        else if (grade == 100.00 || grade >= 95.0) {
            gpa = 4.0;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 94.0) {
            gpa = 3.9;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 93.0) {
            gpa = 3.7;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 92.0) {
            gpa = 3.6;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 91.0) {
            gpa = 3.5;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 90.0) {
            gpa = 3.4;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 89.0) {
            gpa = 3.3;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 88.0) {
            gpa = 3.2;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 87.0) {
            gpa = 3.1;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 86.0) {
            gpa = 3.0;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 85.0) {
            gpa = 2.9;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 84.0) {
            gpa = 2.8;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 83.0) {
            gpa = 2.7;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 82.0) {
            gpa = 2.6;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 81.0) {
            gpa = 2.5;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 80.0) {
            gpa = 2.4;
            System.out.println(" Your GPA is: " + gpa);
        }

        else if (grade >= 79.0) {
            gpa = 2.3;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 78.0) {
            gpa = 2.2;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 77.0) {
            gpa = 2.1;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 76.0) {
            gpa = 2.0;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 75.0) {
            gpa = 1.9;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 74.0) {
            gpa = 1.8;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 73.0) {
            gpa = 1.7;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 72.0) {
            gpa = 1.6;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 71.0) {
            gpa = 1.5;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 70.0) {
            gpa = 1.4;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 69.0) {
            gpa = 1.3;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 68.0) {
            gpa = 1.2;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 67.0) {
            gpa = 1.1;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 66.0) {
            gpa = 1.0;
            System.out.println("Your GPA is: " + gpa);
        }

        else if (grade >= 60.0) {
            gpa = 0;
            System.out.println(" your GPA is: " + gpa);
        }

        else {

            System.out.println(
                    "The grade entered is not valid, please enter a number from 0 to 100 without the % simbol ");

        }

    }

}
