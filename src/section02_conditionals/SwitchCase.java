package section02_conditionals;


import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

/* switch (operation ) {
        case situation 1 :
         break;
         case situation 2 :
          break;
         case situation 3 :
          break;

          default :
           System.out.println( for example invalid operation)
}
            break ;  */

    int operation = scanner.nextInt() ; //define an operation

    switch(operation){
        case 1:
            System.out.println("1.operation selected ");
            break;
        case 2:
            System.out.println("2. operation selected ");
            break;
        case 3:
            System.out.println("3. operation  selected   ");
            break;
        default:
            System.out.println("Invalid Operation");

    }

    }


}
