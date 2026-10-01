package section04_methods;

import java.util.Scanner;

public class GcdFinder {

  public static int findGcd(int number1,int number2){
    int gcd = 1 ;

    for (int i=1;i<=number1&&i<=number2;i++){
        if ((number1%i==0)&&(number2%i==0)){
            gcd=i;


        }
    }
  return gcd;
  }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter fırst number  ");
        int number1 = scanner.nextInt();
        System.out.println("please enter second number");
        int number2 = scanner.nextInt();
        System.out.println("greated divisor of two number is : "+findGcd(number1,number2));

     scanner.close();
    }

    /*Algorithm of GcdFinder
    1.method definition :
      the method takes two numbers as paramaters :(int number1,int number2 )
      the return data type is specified as int
    2. Base value
       the variable 'int ebob = 1;' is defined

     3.Settin up the for loop :
      initialization: starts with =1 (the smalest positive divisior)

      termination condition: since a common divisor must divede both numbers,
      the loop continues up to the smaller of the wo number (i<=number1&&i<=number2)

       increment: increases by one in eah iteration (.i++)

     4.  ın-Loop Check(if)
       at each step, the following logcal condition is tested
        number1%i==0&&number2%i==0
       if both numbers are divisible by i without a remainder
       the curent value of i is assigned to the be ebob variable (ebob = i )

        as the number increases,it overwrite the previous value;thus, the final number remaining when the loop concludes becomes the gratest common divisor

     5. Returning the value once the loop has completely   finished the result  is sent back to caller via the line 'return ebob;'



     */



}
