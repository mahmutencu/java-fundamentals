package section03_loops;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {

/* DoWhilelOOPS

        do {
            ıt runs long as = 0 as the condition is true
           its difference from the while  loop is that it executes at least once .
        } while(condition){
        }

      int i = 0;
      do {
          System.out.println("i = " + i);
          i++;
      } while(i<5);
      */
        /* Algorithm for the  sum of the digits  of a number
        * create th scanner object
        *get the number from user as a input
        *define a variable to keep the sum of number
        * divid the number to 10  to finding the once place
        * use the number/=10  formula to delete the last step
        * do these steps until last step of number being zero
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number ");
        int number = scanner.nextInt();
        int  sum = 0;
        do {
        sum +=number%10;
        number/=10;
            System.out.println("number " + number);
        }while(number>0);
        System.out.println("sum of digits is "+ sum );
    }
}
