package section02_conditionals;
import java.util.Locale;
import java.util.Scanner;


public class AdvancedGradeCalculator {
    public static void main(String[] args) {
        /* Algorithm of AdvancedGradeCalculator
        1)create scanner objet and import the java.util.scanner
        2)get input of midterm1,midterm2,finalexam scores
        3)sum the  30% of the first midterm exam, 30% of the second midterm exam, and 40% of the final exam score.
        4) Design the conditional blocks according to the following conditions:
             90 and above: AA
             85 – 89: BA
             80 – 84: BB
             75 – 79: CB
             70 – 74: CC
             65 – 69: DC (Conditionally Passed)
             60 – 64: DD (Conditionally Passed)
             Below 60: FF (Failed)

          5)If a student has passed with a DD grade and their overall GPA is below 2.5, the message is:
          "You passed with a DD, but your overall GPA is low; you might consider retaking this course."


         */
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the midterm1,midterm2 and finalexam scores with order  ");
        double midterm1 = scanner.nextDouble();
        double midterm2 = scanner.nextDouble();
        double finalexam = scanner.nextDouble();
        System.out.println("what is your gpa score ?");
        double gpa = scanner.nextDouble();

        double letergrade = (double) ((midterm1 * 3 / 10) + (midterm2 * 3 / 10) + (finalexam * 4 / 10));
        if (letergrade >= 90) {
            System.out.println("your Leter Grade is " + "AA");
        } else if (letergrade <= 89 && letergrade >= 84) {
            System.out.println("your Leter Grade is " + "BA");

        } else if (letergrade <= 83 && letergrade >= 80) {
            System.out.println("your Leter Grade is " + "BB");
        } else if (letergrade <= 79 && letergrade >= 75) {
            System.out.println("your Leter Grade is " + "CB");
        } else if (letergrade <= 74 && letergrade >= 70) {
            System.out.println("your Leter Grade is " + "CC");
        } else if (letergrade <= 69 && letergrade >= 65) {
            System.out.println("your Leter Grade is " + "DC");
        } else if (letergrade <= 64 && letergrade >= 60) {
            System.out.println("your Leter Grade is " + "DD");
            if (gpa < 2.5) {
                System.out.println("You passed with a DD, but your overall GPA is low; you might consider retaking this course. ");
            }
        }
        else if (letergrade <= 59) {
                System.out.println("you failed the course ");
            } else {
                System.out.println("invalid score");
            }

        }
    }


