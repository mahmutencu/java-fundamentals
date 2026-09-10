package section01_basics;
import java.util.Scanner;
import java.util.Locale;
public class UserInputScanner {
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("What is your name");
        String name = scaner.nextLine();

        System.out.print("how old are you ");
        int age = scaner.nextInt();

        System.out.print("enter your height(e.g:1.75)");
        double height = scaner.nextDouble();

        System.out.println("\n---user information---");
        System.out.println("Name" + name);
        System.out.println("Age" + age );
        System.out.println("Height" + height);
        scaner.close();
    }
}
