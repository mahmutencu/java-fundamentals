package section02_conditionals;

import jdk.swing.interop.SwingInterOpUtils;

public class ComparisonAndLogicalOperators {
    public static void main(String[] args) {
        /*  Comprasion operators
        ==   is equal to?
        !=     is not equal to?
        >      is greater than?
        >=     is greater than or equal to?
        <      is less than?
        <=     is less than or equal to?*/


        System.out.println(3+8 == 7+1 );
        System.out.println(5!=4 );
        System.out.println(514*19>17*490);
        System.out.println(15*7>=17*14);
        System.out.println(14*78<65*17);
        System.out.println(15*16<=16*16);

        /*Logical Operators
        &&--and opretator: if all conditions are true output is true otherwise false
        ||--or operator :if even one of the conditions is true output is true
        !--not opreator :It takes the negation of the condition where it is used.  */

        System.out.println((11+24)==(24+26));
        System.out.println((23*27)<(24*26));
        System.out.println("pation"=="pation");

        System.out.println(3==4 && 5<6 || "pation"=="pation");
        System.out.println(!(3<4));


    }

}
