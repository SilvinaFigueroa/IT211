
import java.util.*;

public class percentage_gpa_switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your GPA grade (from 4.0 to 1.0 or if you GPA is zero just add 0.0):");
        String gpa = input.next();

        input.close();

        String percentageRange = "Please, check your GPA grade input. It should be a value between 4.0 and 1.0 (please follow the format #.#)";

        switch (gpa) {

            case "4.0":
                percentageRange = "Your percentage range is from 100% to 95%";

                break;

            case "3.9":
                percentageRange = "Your percentage range is between 95% to 94%";
                break;

            case "3.8":
                percentageRange = "Your percentage range is between 95% to 94%";
                break;

            case "3.7":
                percentageRange = "Your percentage range is between 93% to 92%";
                break;

            case "3.6":
                percentageRange = "Your percentage range is between 92% to 91%";
                break;

            case "3.5":
                percentageRange = "Your percentage range is between 91% to 90%";
                break;

            case "3.4":
                percentageRange = "Your percentage range is between 90% to 89%";
                break;

            case "3.3":
                percentageRange = "Your percentage range is between 89% to 88%";
                break;

            case "3.2":
                percentageRange = "Your percentage range is between 88% to 87%";
                break;

            case "3.1":
                percentageRange = "Your percentage range is between 87% to 86%";
                break;

            case "3.0":
                percentageRange = "Your percentage range is between 86% to 85%";
                break;

            case "2.9":
                percentageRange = "Your percentage range is between 85% to 84%";
                break;

            case "2.8":
                percentageRange = "Your percentage range is between 84% to 83%";
                break;

            case "2.7":
                percentageRange = "Your percentage range is between 83% to 82%";
                break;

            case "2.6":
                percentageRange = "Your percentage range is between 82% to 81%";
                break;

            case "2.5":
                percentageRange = "Your percentage range is between 81% to 80%";
                break;

            case "2.4":
                percentageRange = "Your percentage range is between 80% to 79%";
                break;

            case "2.3":
                percentageRange = "Your percentage range is between 79% to 78%";
                break;

            case "2.2":
                percentageRange = "Your percentage range is between 78% to 77%";
                break;

            case "2.1":
                percentageRange = "Your percentage range is between 77% to 76%";
                break;

            case "2.0":
                percentageRange = "Your percentage range is between 76% to 75%";
                break;
            case "1.9":
                percentageRange = "Your percentage range is between 75% to 74%";
                break;

            case "1.8":
                percentageRange = "Your percentage range is between 74% to 73%";
                break;

            case "1.7":
                percentageRange = "Your percentage range is between 73% to 72%";
                break;

            case "1.6":
                percentageRange = "Your percentage range is between 72% to 71%";
                break;

            case "1.5":
                percentageRange = "Your percentage range is between 71% to 70%";
                break;

            case "1.4":
                percentageRange = "Your percentage range is between 70% to 69%";
                break;

            case "1.3":
                percentageRange = "Your percentage range is between 69% to 68%";
                break;

            case "1.2":
                percentageRange = "Your percentage range is between 68% to 67%";
                break;

            case "1.1":
                percentageRange = "Your percentage range is between 67% to 66%";
                break;

            case "1.0":
                percentageRange = "Your percentage range is between 66% to 65%";
                break;

            case "0.0":
                percentageRange = "Your percentage range is between 65% to 0.0%";
                break;

        }

        System.out.println(percentageRange);

    }

}
