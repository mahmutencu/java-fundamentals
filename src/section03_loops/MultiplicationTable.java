package section03_loops;

import jdk.swing.interop.SwingInterOpUtils;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*ALGORİTHM OF MultiplicationTable
        1. Outer Loop
         -starat the i variable from 1,increses i until i<=10
        2.Inner Loop
        -start the j variable from 1 until j <=10 for each step of outer loop
        -print the result ofmutiplicaton
        print (i+"x"+j"="+(i*j))
         print("-----------------------------")
        */
      for (int i = 1;i<=10;i++){
          for (int j = 1;j<=10;j++){
              System.out.println(i + " x " + j + " = " + (i * j));
                System.out.println("-----------------");
            }
        }

    }
}
