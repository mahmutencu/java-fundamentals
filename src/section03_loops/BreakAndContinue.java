package section03_loops;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {

     /* Break :
      The loop terminates when it encounters a break statement within any code block.

!!the break statement terminates only loop in which it is contained.
!!if a 'break' statement is used withi one of set of nested loops, it terminates only that specific loop

      */

       /* int i = 0;
        while (i<20){
            if (i==10){
                break;
            }
            System.out.println("i = " + i);
            i+=2;
        }*/

       /*  Scanner scanner = new Scanner(System.in);

        while(true){
            int operation= scanner.nextInt();
            if (operation == -1){
                System.out.println("the loop is ended");
                break;
            }
            System.out.println("operation:"+operation);
        } */

       /*"When a loop encounters continue,
       it skips the remaining statements in the current iteration and jumps directly to the next iteration (evaluating the update step and loop condition)."*/

    /*for (int i = 0;i<10;i++){
        if (i==3||i==5){
            continue;
        }
        System.out.println("i =" + i);
    }*/

        /*If the `continue` statement is used within a `while` loop, the variable's value must be incremented or decremented before the `continue` statement; otherwise, an infinite loop will occur.

     */

   /*  int i = 0;
     while(i<20){
         if(i==3){
             i++;//If the increment is not performed before the `continue` statement, it enters an infinite loop.
             continue;
         }
         System.out.println("i = "+i);
         i++;

     }*/




    }
}
