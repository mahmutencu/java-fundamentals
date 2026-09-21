package section03_loops;

import java.util.Locale;
import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
   /*Algorithm of ATMProject

   1.Initialization:
    -set Locale to Locale.us to ensure standardized decimal formating
    -initialize a scanner instance for console input
    - define and initialize the initial acount (e.g.,1000.0

   2.Display Interface:
    -print the welcome header and list of available  options
    -1:view balance
    -2:deposit money
    -3: withdraw money
    -q:exit

   3. Infinite control loop (while(true):
    -prompt the user !please select an operation
    - read the users choice in to varable(operation ),trimming surrounding whitespace

   4.Early exit chcek(.guard clause )
    -if operation is equla to 'q' (case-insensitive)
    -terminate the loop immidiately using 'break'

    5. execute core operations (conditional branching
     !!if not exiting,evaluate opretaion:
      -Case"1" view the balance
         print the curent 'balance'
     -Case"2" (Deposit )
       prompt for the deposit 'amount.'
       clear the input buffet
     if amount>0:
      update balance  balance+=amount
      print confirmation an update balance
     else
      print an eror "invalid deposit amount "

     -Case"3" (withdraw)
       prompt the withdrawal amount
       clear the input buffer üif amount balance
       print an  error:"invalid withdarawal amount
     else
      update balancebalance-=amount
      print comfirmation and updated tbalance

     default(.invalid input )
     print (invalid operation please try again "

    Cleanup :
    after breaking out of the loop, clos the scanner resource

     */

      double balance = 1000.0;
        Locale.setDefault(Locale.US);
        String operations = "1.operation: view balance \n"
                +"2.operation: Deposit money \n"
                +"3.operation: Withdraw money\n"
                +" press the 'q' to exit\n";
        System.out.println("************************************");
        System.out.println(operations);
        System.out.println("************************************");


        while(true){
            System.out.println("please select an operation ");
            String operation = scaner.nextLine();
            if (operation.equalsIgnoreCase("q")) {
                System.out.println("exiting the program  ");
                break;
            } else if (operation.equals("1")) {
                System.out.println("your balance is :"+balance );
            } else if (operation.equals("2")) {
                System.out.println("Please enter the amount you wish to deposit. ");
                double amount = scaner.nextDouble();
                scaner.nextLine();
                balance+=amount;
                System.out.println("your new balance is " + balance );
            } else if (operation.equals("3")) {
                System.out.println("please enter the amount of money that you wil withdraw");
                double amount = scaner.nextDouble();
                scaner.nextLine();
                if (balance - amount < 0) {
                    System.out.println("Insufficient funds");
                } else {
                    balance -= amount;
                    System.out.println("your updated balance is " + balance);
                }
            }else {
                    System.out.println("invalid operation, please try again ");
            }

            }

        }









    }

