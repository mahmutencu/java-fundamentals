package section04_methods;


import java.util.Scanner;

public class AdvancedCalculator  {
    public static int subtraction(int a , int b ){

        return (a-b);
    }
    public static int sum (int a ,int b ){
        return (a+b);
    }
    public static int sum (int a , int b, int c ){
        return (a+b+c);

    }
public static double divide (int a ,int b ){
        return ((double)a/b);
    }
public static int multiplication(int a,int b ){
        return (a*b);

}public static int multiplication (int a ,int b, int c ){
        return (a*b*c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operations = "1. sum operation\n"
                +"2.subtraction operation\n"
                +"3. multiplaction operation\n"
                +"4. divide operation\n"
                +"press 'q' to exit ";
        System.out.println("************************");
        System.out.println(operations);
        System.out.println("************************");

        while (true) {
            System.out.println("please select an operation ");
            String operation= scanner.next();

            if (operation.equalsIgnoreCase("q")) {

                System.out.println("you are exiting program ");
                break;
            }

                else if (operation.equals("1")) {
                System.out.println("How many values will you collect? (2 ore 3 )");

                int howmanynumbers = scanner.nextInt();
                if (howmanynumbers == 2) {
                    System.out.println("please enter the first number ");
                    int number1 = scanner.nextInt();
                    System.out.println("please enter the second number ");
                    int number2 = scanner.nextInt();
                    System.out.println("sum of your numbers is " + sum(number1, number2));


                } else if (howmanynumbers == 3) {
                    System.out.println("please enter the first number ");
                    int number1 = scanner.nextInt();
                    System.out.println("please enter the second number ");
                    int number2 = scanner.nextInt();
                    System.out.println("please enter the third number ");
                    int number3 = scanner.nextInt();
                    System.out.println("sum of your numbers is " + sum(number1, number2, number3));

                } else {
                    System.out.println("there is no suitable method for this. ");
                }
            }
                else if(operation.equals("2")){
                    System.out.println("please enter the first number ");
                    int number1 = scanner.nextInt();
                    System.out.println("please enter the second number ");
                    int number2 = scanner.nextInt();
                    System.out.println(("subtraction of your number is ")+subtraction(number1,number2));

                } else if (operation.equals("3")) {
                System.out.println("How many values will you multiply? (2 ore 3 )");

                int howmanynumbers = scanner.nextInt();
                if (howmanynumbers == 2) {
                    System.out.println("please enter the first number ");
                    int number1 = scanner.nextInt();

                    System.out.println("please enter the second number ");
                    int number2 = scanner.nextInt();
                    System.out.println("multiplaction  of your numbers is " + multiplication(number1, number2));


                } else if (howmanynumbers == 3) {
                    System.out.println("please enter the first number ");
                    int number1 = scanner.nextInt();
                    System.out.println("please enter the second number ");
                    int number2 = scanner.nextInt();
                    System.out.println("please enter the third number ");
                    int number3 = scanner.nextInt();
                    System.out.println("multiplaction  of your numbers is " + multiplication(number1, number2, number3));
                }
            }else if (operation.equals("4")){
                        System.out.println("pleas enter the first number ");
                        int number1 = scanner.nextInt();


                        System.out.println("pleas enter the second  number ");
                        int number2 = scanner.nextInt();
                        System.out.println("division of your number is "+divide(number1,number2));
                    }else {
                System.out.println("Invalid operation!! please select 1,2,3,4 or q");
            }
                }

            }


        }




