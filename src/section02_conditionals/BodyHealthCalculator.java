package section02_conditionals;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.Locale;
public class BodyHealthCalculator {
    public static void main(String[] args) {



        Scanner scaner = new Scanner(System.in).useLocale(Locale.US);

        /*Algorithm and the purpose  of  bodhealthcalculator
        1)creat scanner object
         2) get these  input from user about him/her
         weight,height and calculate the bmi bmi=wight(kg)/(height*height(meter)
         calculate the bmi and compare with world standarts
         3)get these input gender,age ,and daily activity level from 1 to 5
        */
        System.out.println("helo please fisrtly enter your weight as a kg and secondly your height as a meter " +
                "to learn  your BMİ");
         double weight = scaner.nextDouble();
         double height = scaner.nextDouble();
         double BMI =  (weight/(height*height));
        if (BMI < 18.5) {
            System.out.println("You are underweight");
        } else if (BMI < 25.0) {
            System.out.println("You are at normal standards");
        } else if (BMI < 30.0) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obese");
        }


                double tall = height*100;

                System.out.println("Please fill in the information required " +
                        "to calculate your daily calorie needs. ");

                System.out.println("how old are you");
                 int age = scaner.nextInt();

                System.out.println("what is your gender (e.g:m=male,f:female");
        char gender = scaner.next().charAt(0);
        double bmr = 0;
        double tdee = 0;

        if (gender == 'M' || gender == 'm')  {
                     bmr = ((10 * weight) + (6.25 * tall)-(5 * age) + 5);
                }
        else if (gender == 'F' || gender == 'f')  {
                         bmr = ((10*weight)+(6.25*tall)-(5*age)-161);
                    }
                    else System.out.println("invalid gender");

                System.out.println("1 - Sedentary (Desk job, no exercise)\n" +
                        "2 - Lightly Active (Light exercise 1-3 days a week)\n" +
                        "3 - Moderately Active (Moderate-paced exercise 3-5 days a week)\n" +
                        "4 - Very Active (Intense exercise/activity 6-7 days a week)");

                int act= scaner.nextInt();

                switch (act){
                    case 1 :
                         tdee =  bmr * 1.2;
                        System.out.println(tdee);
                        break;
                    case 2:
                         tdee =  bmr*1.375;
                        System.out.println(tdee);
                        break;
                    case 3 :
                         tdee =  bmr *1.55;
                        System.out.println(tdee);
                        break;
                    case 4 :
                         tdee = bmr * 1.725;
                        System.out.println(tdee);
                        break;
                    default:
                        System.out.println("undefined select ");





                }

        }
    }
