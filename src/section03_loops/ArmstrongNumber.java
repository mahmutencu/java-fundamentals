package section03_loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        /*Algorithm of ArmstrongNumber
    1.initialization:
     -create scanner object
     -get the number as a input from the user:int number
     -get the number of digit as a input from the user: int numberOfDigits
     -create a backup variable so the original value isn't lost while down the digits of the number
     - To hold the sum of the exponents create a totatal  variable
    2. calculation with do-while
      -start a do-while loop
      -find the last digit of number int digitValue=tempNumber%10
      -delete the last digit from the number tempNumber/=10
      -calculate the powerand add it to total variable total+=math.pow(digitValue,numberOfDigits);
      -condition: continue these operation as long tempNumber>0(while(tempNumber>0);)
     3.verification
      -if total == number
        print " number is armstrong number "
        else
        "number is a not an armstrong number"
     4.cleanup
      scanner.close()

        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number to check if its armstrong number or not  ");
          int number= scanner.nextInt();
        System.out.println("how many digits does your number have ?");
          int numberOfDigits=scanner.nextInt();
          int tempNumber=number;
          int total=0;
          do {
              int digitValue = tempNumber%10;
              tempNumber/=10;
              total+=(int) Math.pow(digitValue,numberOfDigits);

          }while(tempNumber>0);
          if (total==number){
              System.out.println(number+"\tis an Armstrong number ");
          }else {
              System.out.println(number + "\tis a not an Armstrong number ");
          }
          scanner.close();

    }
}
