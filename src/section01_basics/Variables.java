package section01_basics;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class Variables {
    public static void main(String[] args) {

        /* Defining variables:
        int a=4 ;
        int b=8;
        int c = a+b;
        int sum =a+b+c;
        System.out.println("sum of a,b and c is "+sum);

!!! we can't use an integer number while defining variables */

        /*Integer variable types ande their bounds (int,byte,short and long)*/

        /*System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        -automatic conversion=> byte-->short-->integer-->long  */

        /* Types of Decimal Numbers  */


        //Double : 64 bit - 8 btyte
        // Float : 32 bit - 4 byte
        // automatic conversion==> int-->float-->double

     /* int a = 22/7;
      float b= 22f/7f;
      double c = 22d/7d;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+ c);*/

        /* Variable types:Char and Bolean */
//The char data type is used to represent characters.
// The boolean data type is used in conditional situations and takes a value of true or false.

       /* char a = 'A';
        char b= '?';
        char c= 150;
        char d = '\u0552'; --> number of a character from  unicode table
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        boolean a = true;
        boolean b = false;
        System.out.println(a);
        System.out.println(b);
        */

        /*String Data type */

        /*String a = " helo " ;
        System.out.println(a+"welcome");


 String a ="regards to the ";
 int b = 73 ;
    String c = a + b;
        System.out.println(c);

        String a = "java: "+
                "programing "
                +" language ";
        System.out.println(a);

// !!!  \t means one tab brake
// !!!  \n means moves the next line

        String a = "java\tis\tan useful\tprograming\tlanguage";
        System.out.println(a);
        String a = "it's\ngoes\nto\nthe\nnext\nline ";
        System.out.println(a);*/

    }
}
