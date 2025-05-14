using System;

class Program
{
    static void Main()
    {

        
        // 1. Write the program to demonstrate the working of Binary Arithmetic Operators
        Console.WriteLine("Enter value of a:");
        int a = int.Parse(Console.ReadLine());
        Console.WriteLine("Enter value of b:");
        int b = int.Parse(Console.ReadLine());

        Console.WriteLine("Addition Operator: " + (a + b));
        Console.WriteLine("Subtraction Operator: " + (a - b));
        Console.WriteLine("Multiplication Operator: " + (a * b));
        Console.WriteLine("Division Operator: " + (a / b));
        Console.WriteLine("Modulo Operator: " + (a % b));





        // 2. Write the program to demonstrate the working of Unary Arithmetic Operators
        Console.WriteLine("Enter a value:");
        int val = int.Parse(Console.ReadLine());

        int res = val++;
        Console.WriteLine("a is " + val + " and res is " + res);

        val = int.Parse(Console.ReadLine());
        res = val--;
        Console.WriteLine("a is " + val + " and res is " + res);

        val = int.Parse(Console.ReadLine()); 
        res = ++val;
        Console.WriteLine("a is " + val + " and res is " + res);

        val = int.Parse(Console.ReadLine()); 
        res = --val;
        Console.WriteLine("a is " + val + " and res is " + res);





        // 3. Write the program to demonstrate the working of Relational Operators
        Console.WriteLine("Enter value of a:");
        int r1 = int.Parse(Console.ReadLine());
        Console.WriteLine("Enter value of b:");
        int r2 = int.Parse(Console.ReadLine());

        Console.WriteLine("Equal to Operator: " + (r1 == r2));
        Console.WriteLine("Greater than Operator: " + (r1 > r2));
        Console.WriteLine("Less than Operator: " + (r1 < r2));
        Console.WriteLine("Greater than or Equal to: " + (r1 >= r2));
        Console.WriteLine("Lesser than or Equal to: " + (r1 <= r2));
        Console.WriteLine("Not Equal to Operator: " + (r1 != r2));
    }
}
