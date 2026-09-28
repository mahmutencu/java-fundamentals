package section04_methods;

public class LocalVariablesScope {

    public static void testMethod() {
        int methodNumber = 50;
// This variable exists only within testMethod.
// The main method or any other place cannot see anything named 'methodNumber'.
    }

    public static void main(String[] args) {

// CASE 1: Method-Level Local Variable
        int a = 10;
// System.out.println(methodNumber); // ERROR! The variable inside testMethod cannot be accessed here.


// CASE 2: Scope in if / else Blocks
        if (a > 5) {
            int blockVariable = 99; // Exists only within the braces { } of this if block.
            System.out.println(blockVariable); // WORKS: We are inside the block.
            System.out.println(a); // WORKS: The outer variable 'a' is accessible inside.
        }
// System.out.println(blockVariable); // ERROR! 'blockVariable' was removed from memory as soon as the if block closed.


// CASE 3: Scope of Loop (for / while) Counters
        for (int i = 0; i < 3; i++) {
// 'i' exists only within this for loop.
            System.out.println("Inside loop: " + i);
        }
// System.out.println(i); // ERROR! 'i' ceased to exist when the loop ended; it is not recognized outside.


// CASE 4: Rules for Defining Variables with the Same Name
// The code below works because the previous 'i' ceased to exist after its loop ended:
        for (int i = 0; i < 2; i++) {
            System.out.println("Inside new loop: " + i);
        }

// int a = 20; // ERROR! There is already an 'a' in scope within 'main'; it cannot be redefined in the same block.


// CASE 5: Opening an Independent Curly Brace { } Block
        {
            int temp = 500;
            System.out.println("Temp: " + temp); // WORKS
        }
// System.out.println(temp); // ERROR! The braces closed, and 'temp' went out of scope.
    }
}
