package section04_methods;

public class MethodParameters {
    public static void welcome(String name ){
        System.out.println("welcome "+name);
    }
    public static void sum(int a,int b,int c ){
        System.out.println("sum of numbers you entered is " +(a+b+c));
    }
    public static void main(String[] args) {
        welcome("mahmut");
        sum(1,2,3);

    }
}
