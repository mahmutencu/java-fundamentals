package section01_basics;

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        /* Algotirhm of SwapVariables
        1) create scanner object
        2)define two variable (integer,double ex)
        3)print the number before the swaping them
        4) define a temp variable
        5) swap the value of variables
        6) print the variables to the screen */
        int number1;
        int number2;
        System.out.println("enter the first number ");
        number1=scanner.nextInt();

        System.out.println("enter the scond number");
        number2= scanner.nextInt();

        System.out.println("first number is " +number1+ " and\t"+"second number is "+number2);
        int temp = number1;
         number1=number2;
         number2=temp;
        System.out.println("after the sawping "
                +"first number is "+ number1
        +"  and second number is  "+ number2 );

    }
}
