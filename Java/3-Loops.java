public class LoopsExample {


    // 1. Write a program to print “Bright IT Career” ten times using for loop
    public static void printCareerMessage() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Bright IT Career");
        }
    }






    // 2. Write a java program to print 1 to 20 numbers using the while loop.
    public static void printNumbersWhile() {
        int i = 1;
        while (i <= 20) {
            System.out.println(i);
            i++;
        }
    }






    // 3. Program to equal operator and not equal operators
    public static void checkEqualityOperators(int a, int b) {
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
    }






    // 4. Write a program to print the odd and even numbers.
    public static void printOddEven() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is Even");
            else
                System.out.println(i + " is Odd");
        }
    }






    // 5. Write a program to print largest number among three numbers.
    public static void largestOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a + " is the largest");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest");
        } else {
            System.out.println(c + " is the largest");
        }
    }






    // 6. Write a program to print even number between 10 and 100 using while
    public static void evenNumbersWhile() {
        int i = 10;
        while (i <= 100) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }
    }






    // 7. Write a program to print 1 to 10 using the do-while loop statement.
    public static void printDoWhile() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }







    // 8. Write a program to find Armstrong number or not
    public static void isArmstrong(int num) {
        int original = num, result = 0, remainder;
        while (original != 0) {
            remainder = original % 10;
            result += Math.pow(remainder, 3);
            original /= 10;
        }
        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }






    // 9. Write a program to find the prime or not.
    public static void isPrime(int num) {
        boolean isPrime = true;
        if (num <= 1) isPrime = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num + " is a Prime number.");
        else
            System.out.println(num + " is not a Prime number.");
    }






    // 10. Write a program to palindrome or not.
    public static void isPalindrome(int num) {
        int original = num, reversed = 0, remainder;
        while (num != 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }
        if (original == reversed)
            System.out.println(original + " is a Palindrome.");
        else
            System.out.println(original + " is not a Palindrome.");
    }







    // 11. Program to check whether a number is EVEN or ODD using switch
    public static void checkEvenOddSwitch(int num) {
        switch (num % 2) {
            case 0:
                System.out.println(num + " is Even.");
                break;
            case 1:
                System.out.println(num + " is Odd.");
                break;
        }
    }






    // 12. Print gender (Male/Female) program according to given M/F using switch
    public static void printGender(char gender) {
        switch (gender) {
            case 'M':
            case 'm':
                System.out.println("Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid input");
        }
    }






    // 13. Program for multiple if else statement(Largest number in 10,20 and 30)
    public static void multipleIfElse() {
        int a = 10, b = 20, c = 30;
        if (a > b && a > c) {
            System.out.println("Largest: " + a);
        } else if (b > c) {
            System.out.println("Largest: " + b);
        } else {
            System.out.println("Largest: " + c);
        }
    }


    
    public static void main(String[] args) {
        printCareerMessage();
        printNumbersWhile();
        checkEqualityOperators(5, 5);
        printOddEven();
        largestOfThree(100, 300, 250);
        evenNumbersWhile();
        printDoWhile();
        isArmstrong(153);
        isPrime(29);
        isPalindrome(121);
        checkEvenOddSwitch(6);
        printGender('M');
        multipleIfElse();
    }
}
