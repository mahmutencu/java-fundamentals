package section02_conditionals;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

     /*
     if (condition) { this code block executes
     if the condition in parantheses is met
      }
      else {   if the 'if' condition is not met
      ,this code block executes.
      you cannot use else without if
      }
      */

        Scanner scanner = new Scanner(System.in);

        //understanding the  if condition
        System.out.println(
                " welcome to the java world\n " +
                "how old are you ? ");
          int age = scanner.nextInt();

          if (age<18){
              System.out.println("sory!! you can not enter ");
          }
          else {
              System.out.println(" welcom to the java world\n " +
                      "please dont forgget \n" +
                      "your only limit is your imagination ");
              }

        /* If with multi else ıf kod blocks  */

        System.out.println("what is yuor exam score ? ");
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("Your leter grade is  AA");
        } else if (score >= 80) {
            System.out.println("your leter grade is BB");

        } else if (score >=70) {
            System.out.println("your leter grade is  CC");

        } else if (score >=60) {
            System.out.println("your leter grade is DC ");
        }

        else {
            System.out.println("you failed the course ");
        }

        }

        }
