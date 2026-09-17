package section02_conditionals;
  import java.util.Locale;
   import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        /* SimpleCalculator algorithm's
        1) create scanner objet
        2) print the operations
        3) get input of selected operation
        4)  define number as a double
        5) use switch case to aplying the operation
        6) get the numbers and aply the operation in cases
        */


        Scanner scanner = new Scanner(System.in);
        String operations= "1. sum operation\n"
                         +"2. subtraction operation\n"
                         +"3. mutliplication\n"
                         +"4.division opretion\n";
        System.out.println(operations);
        System.out.println("select the operation");
        String operation = scanner.nextLine();
        double a;
        double b;
        switch (operation){
            case "1":
                System.out.print("enter the first number" );
                a =scanner.nextDouble();
                System.out.print("enter the second number");
                b= scanner.nextDouble();;
                System.out.println("sum of numbers is "+(a+b));
                break;

            case "2":
                System.out.print("enter the first number" );
                a =scanner.nextDouble();
                System.out.print("enter the second number");
                b= scanner.nextDouble();;
                System.out.println(" subtraction of numbers is "+(a-b));
                break;
            case "3":
                System.out.print("enter the first number" );
                a =scanner.nextDouble();
                System.out.print("enter the second number");
                b= scanner.nextDouble();;
                System.out.println("multiplation of  numbers is "+(a*b));
                break;
            case "4":
                System.out.print("enter the first number" );
                a =scanner.nextDouble();
                System.out.print("enter the second number");
                b= scanner.nextDouble();
                if (b==0){
                    System.out.println("the denominator cannot be zero ");}

               else{
                        System.out.println("division  of numbers is " + (a / b));
                    }
                break;
            default:
                System.out.println("invalid operation selected ");


        }







    }

}
