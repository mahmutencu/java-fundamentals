package section03_loops;

import java.util.Scanner;

public class InterestApplication {
    public static void main(String[] args) {

        /* Algorithm of Interest Application
        1.initalization
          - create scanner object
          -get the input for the principal amount to deposit
          -sout:"enter the principal amount"
          double principle =scanner.nextDouble()
          -get input for how many years money will be invested
          sout:"how many year you will invested your money"
          int matuatiry=scanner.nextınt()
          -set the fixed interest rate:
          double interestRate=0.06
          2. Loop calculation(for loop)
            setup for the loop that runs from year 1 up to the entered matuarity :
            for(int year =1;year<=matuarity;year++)
            add the interest to principal each year
            pricipal+=(principal*interestRate);
            print the total amount reached at the end of that year :
            sout:"total amount at the end of year "+year+":"+principal


            scanner.close()
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the principal amount. ");
           double principal = scanner.nextDouble();
        System.out.println("for how many years do you want to invest your money ");
           int maturity = scanner.nextInt();
           double interestRate = 0.06;
           for (int year=1;year<=maturity;year++){
            principal+=principal*interestRate;
            System.out.println("total amount at the and of year"+year+":"+principal);

        }
           scanner.close();
    }
}
