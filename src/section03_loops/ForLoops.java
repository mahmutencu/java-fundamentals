package section03_loops;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {


    /*ForLoops
    for(starting;condition;increase/decrease){
    This code block executes as long as the `for` loop's condition is met.

     */

      /*    int i ;
        System.out.println(" the even numbers less than 10 are ");

        for (i=0;i<10;i+=2){
            System.out.println("i = "+i);
        }

      */

        /*  !!!Variables defined within a for loop can only be used within that loop.

        System.out.println("the odd numbers less than 10 are:");

        for (int i =1;i<10;i+=2){
            System.out.println("i = "+ i);

        }
     */

      /*  !!The initial value of the variable can be defined outside the loop.

        System.out.println("let's count down from 10 together ");

        int i =10 ;
        for ( ; i>0 ; i--){
            System.out.println("!!!"+i+ "!!!");
        }
       */

        /* !!A loop with a condition depending on two variables.

        int i = 0;
        int j = 10;
        for (;i<10&&j>0;i++,j--){
            System.out.println("i = "+  i  + "\t"+"j = " + j );
        }
        */

        /*factorial operation with ForLoop*/

        Scanner scanner=new Scanner(System.in);

        System.out.println("please enter the factorial ");
        int factorial = 1;
        int number = scanner.nextInt();
        for (int i = 1;i<=number;i++){
            factorial *=i;
            System.out.println("factorial = "+factorial+" i = "+i);
        }
        System.out.println( "factorial = "+factorial);


    }

}
