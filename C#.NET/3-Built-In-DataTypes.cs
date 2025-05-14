using System;

class Program
{
    static void Main()
    {


        // Task 1: Declare a value as int datatype and print in the output
        int number = 25;
        Console.WriteLine("The value of the integer is: " + number);






        // Task 2: Write a program in boolean type and print in console
        bool isActive = true;
        Console.WriteLine("The boolean value is: " + isActive);






        // Task 3: Write a program on converting Float to Decimal type and print in console
        float floatValue = 10.5f;
        decimal decimalValue = (decimal)floatValue;
        Console.WriteLine("Converted float value to decimal: " + decimalValue);






        // Task 4: Write a C# Sharp program that takes two numbers as input and perform an operation (+,-,*,/) on them and displays the result of that operation
        Console.WriteLine("Enter first number:");
        double num1 = double.Parse(Console.ReadLine());
        Console.WriteLine("Enter second number:");
        double num2 = double.Parse(Console.ReadLine());

        Console.WriteLine("Enter operation (+, -, *, /):");
        char operation = Console.ReadKey().KeyChar;
        Console.WriteLine(); 

        double result = 0;

        switch (operation)
        {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    result = num1 / num2;
                else
                    Console.WriteLine("Cannot divide by zero.");
                break;
            default:
                Console.WriteLine("Invalid operation.");
                break;
        }

        if (operation == '+' || operation == '-' || operation == '*' || operation == '/')
            Console.WriteLine("Result: " + result);






        // Task 5: Write a C# Sharp program that takes three letters as input and display them in Reverse Order
        Console.WriteLine("Enter letter 1:");
        char letter1 = Console.ReadKey().KeyChar;
        Console.WriteLine();
        Console.WriteLine("Enter letter 2:");
        char letter2 = Console.ReadKey().KeyChar;
        Console.WriteLine();
        Console.WriteLine("Enter letter 3:");
        char letter3 = Console.ReadKey().KeyChar;
        Console.WriteLine();

        Console.WriteLine("Letters in reverse order: " + letter3 + " " + letter2 + " " + letter1);






        // Task 6: Write a C# Sharp program that takes a character as input and check the input (lowercase) is a vowel, a digit, or any other symbol
        Console.WriteLine("Enter a symbol:");
        char symbol = Console.ReadKey().KeyChar;
        Console.WriteLine();

        if (char.IsLower(symbol))
        {
            if ("aeiou".Contains(symbol))
            {
                Console.WriteLine("It is a lowercase vowel.");
            }
            else
            {
                Console.WriteLine("It is a lowercase consonant.");
            }
        }
        else if (char.IsDigit(symbol))
        {
            Console.WriteLine("It is a digit.");
        }
        else
        {
            Console.WriteLine("It is a symbol.");
        }
        
    }
}
