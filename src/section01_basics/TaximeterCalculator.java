package section01_basics;

import java.util.Scanner;

public class TaximeterCalculator {
    public static void main (String[] args){
      /* Algorithm of taximeter calculator
      1)create scaner object
      2) get  the vehicles fuel  cost per kilometer from the user
      3) get the distance traveled in kilometeres
      4) fixed starting if applicable (e.g.,double startPrice=10.0 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the starting fee  ");

        double startingprice= scanner.nextDouble();

        System.out.println("what is the  vehicle's fuel cost per kilometer ?(e.g.,3,4 dolar ");
        double cost = scanner.nextDouble();

        System.out.println("what  is the distance you traveled in kilometers (e.g.,7,5 km  ");
        double travel = scanner.nextDouble();

        double TotalAmount=(startingprice+(cost*travel));
        System.out.println("the total amount of your trip is "+TotalAmount+"dolar");


    }
}
