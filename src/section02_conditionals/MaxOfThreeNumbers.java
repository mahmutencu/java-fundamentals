package section02_conditionals;

import java.util.Scanner;

public class MaxOfThreeNumbers {

    public static void main(String[] args) {
        /* Algorithm of MaxThreeNumber
        1) create scanner object
        2) get  three number form de user
        3 )compare the numbers
        4 ) print  the max number to screen
         */

        Scanner scanner=new Scanner(System.in);


        System.out.println("please enter three number" +
                " with one space betwen them ");
        int firstnumber= scanner.nextInt();
        int secondnumber= scanner.nextInt();
        int thirdnumber= scanner.nextInt();

        if (firstnumber>=secondnumber&&firstnumber>=thirdnumber){
            System.out.println("the largest number is  "+ firstnumber);
        }
        else if (secondnumber>=firstnumber&&secondnumber>=thirdnumber) {
            System.out.println("the largest number is  "+ secondnumber);
        }
        else if (thirdnumber>=firstnumber&&thirdnumber>=secondnumber) {
            System.out.println("the largest number is  "+ thirdnumber);
        }
        else System.out.println("there  is atleast two or more equal number ");
    }
}
