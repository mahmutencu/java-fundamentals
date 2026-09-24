package section04_methods;

import java.util.Scanner;

public class IntroductionToMethods {
    public static void greeting (){
        System.out.println("Hello How are you ? ");
        System.out.println("Mahen industry sends its regards ");
    }
    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number ");
        int number = scanner.nextInt();
        int ressult  = 1;

        for (int i =1;i<=number;i++){
            ressult*=i;
        }
        System.out.println("Factoral of "+number+"is "+ressult);
    }
    public static void main(String[] args) {

/*Access_Definer(optional) Extra_properties Return_Type Function_Name (parameters){

//here is the function block
//the operation that functions do will be at here

}*/

greeting();// we can  call our method to run as many time we wish

factorial();
factorial();
factorial();


    }
}
