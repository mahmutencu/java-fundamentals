package section04_methods;
public class PrimeNumbersFinder {
public static boolean isPrime(int number ){
    if (number <= 1) {
        return false ;
    }
    for (int i =2;i < number;i++ ){
        if (number %i==0){
            return false;
        }

    }
    return true ;
}

    public static void main(String[] args) {
        System.out.println("prime numbers between 1 and 1000");
        for (int i = 2 ;i<=1000;i++){
            if (isPrime(i)){
                System.out.println(i + "");
            }
        }
        System.out.println();
    }

    /* Algorithm of the prime numbers from 1 to 1000

    part1:
     1: Algorithm to determine whether a number is prime (isPrime).given a number (e.g:x)

     - preliminary chek :  if x<=1 than x cannot be prime return false
    2:
      start a counteri=2
      from i to x (i<x )
      check at each step,is the number x divisible by i (x%i==0);
         yes it's divisible means x is not a prime number return false
         no it's not divisible go to the next step

   3: decision
   loop is over and x is not divisible: number x is prime number return true

   part 2 :Component: Algorithm for Traversing the Range 1 to 1000(main)
    start the counter from 2 to 1000 (x=2,3,4,5,6,7....1000)
    send each number(x) to the isPrime(number) method
    if the answer from method is true print the number
    finish the operation when counter reach 1000

     */

}
