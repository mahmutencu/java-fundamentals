package section01_basics;

import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {

        /* Algorithm of HypotenuseCalculator
        1) create scaner object
        2)get fırst leg from the user (double a )
        3) get second leg from user (double a )
        4) calculate the the hypotenuse :
         c=Math.sqrt((a*a)+(b*b))
         5) print the result to the screen   */

        Scanner scanner= new Scanner(System.in);
        System.out.println("please enteer the " +
                "fırst value of leg ");
        double firstleg=scanner.nextDouble();
        System.out.println("please enter " +
                "the value of second leg ");
        double secondleg =scanner.nextDouble();
        double h = Math.sqrt((firstleg*firstleg)+(secondleg*secondleg));

        System.out.println("the hypotenuse is  "+ h);



    }
}
