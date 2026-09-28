package section04_methods;

import com.sun.management.VMOption;

public class MethodOverloading {

   /*Method overloading
    Defining multiple methods with the same name but different operations is called method overloading.
    */
   /* public static void sum (String a,String b){
        System.out.println(a+" "+b);
    }
    public static void sum (int a, int b  ){
        System.out.println("sum is  "+(a+b));
    }
    public static void sum(int a,int b ,int c ){
        System.out.println("sum is  "+ (a+b+c));

    }

    public static void main(String[] args) {
        sum(1,2,3);
        sum(4,5);
        sum("mahmut ","encu");
        }
        */

/*public static void calculatescore(String name , int score) {
    System.out.println("player\t" + name + " has\t " + score + "\tpoint ");
}
public static void calculatescore(int score){
    System.out.println("anonymous player has\t"+score+"\tpoint");
}
public static void calculatescore(String name ){
    System.out.println("player\t"+name+"\thas no point ");
}

    public static void main(String[] args) {

    calculatescore(4000);
    calculatescore("mahmut");
    calculatescore("mahen ",5000);

 }*/

    /*A Very Important Rule: Merely changing the return type (e.g., void or int) does not count as overloading, and the Java compiler will throw an error.
     The number or type of parameters must be different!*/

}
