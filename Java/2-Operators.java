public class OperatorsExample {

    // 1. Write a function for arithmetic operators(+,-,*,/)
    public static void arithmeticOperators(int a, int b) {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }





    // 2. Write a method for increment and decrement operators(++, --)
    public static void incrementDecrementOperators() {
        int x = 5;
        System.out.println("Original: " + x);
        System.out.println("Increment: " + (++x));
        System.out.println("Decrement: " + (--x));
    }





    // 3. Program to equal operator and not equal operators
    public static void equalityOperators(int a, int b) {
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
    }





    // 4. Write a program to find the two numbers equal or not.
    public static void checkEquality(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("Numbers are equal.");
        } else {
            System.out.println("Numbers are not equal.");
        }
    }





    // 5. Programs on Logical AND, OR operator and Logical NOT
    public static void logicalOperators(boolean x, boolean y) {
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT (x): " + (!x));
    }





    // 6. Program for relational operators (<,<==, >, >==)
    public static void relationalOperators(int a, int b) {
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
    }





    // 7. Print the smaller and larger number
    public static void compareNumbers(int a, int b) {
        if (a > b) {
            System.out.println("Larger number: " + a);
            System.out.println("Smaller number: " + b);
        } else if (a < b) {
            System.out.println("Larger number: " + b);
            System.out.println("Smaller number: " + a);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    public static void main(String[] args) {
        arithmeticOperators(10, 5);
        incrementDecrementOperators();
        equalityOperators(10, 10);
        checkEquality(20, 15);
        logicalOperators(true, false);
        relationalOperators(7, 9);
        compareNumbers(25, 30);
    }
    
}
