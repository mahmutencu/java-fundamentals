package section01_basics;

import java.util.Scanner;

public class BMICalculator {
public static void main (String[] args) {

    /*Body Mass Index Calculation algorithm
    1)initialize the Scanner object
    2)Get weight(kg) from the user as double
    3)get height(m) from the user as double
    4)apply the bmı formula
    5)print the result to the screen
     */
    Scanner scanner = new Scanner(System.in);
    System.out.println("pleas enter your weight as kg  ");
    double weight = scanner.nextDouble();
    System.out.println("please enter your height as a meter  ");
    double height = scanner.nextDouble();
    double BMI = weight / (height * height);
    System.out.println("your body mass index is\t" + BMI);



    }


}
