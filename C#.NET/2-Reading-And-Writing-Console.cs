using System;

class Program
{
    static void Main()
    {


        // Task 1: Create a value called EmpName and print that value in the output
        string EmpName = "John Doe";
        Console.WriteLine("EmpName: " + EmpName);





        // Task 2: Declare a variable of any datatype and read the name in the output
        Console.WriteLine("Enter your name:");
        string userName = Console.ReadLine();
        Console.WriteLine("Your Name: " + userName);





        // Task 3: Enter your name and print the output using WriteLine
        Console.WriteLine("Please enter your name:");
        string name = Console.ReadLine();
        Console.WriteLine("Hello, " + name);





        // Task 4: Declare 2 strings as input and concatenate with another string
        Console.WriteLine("Enter your first name:");
        string firstName = Console.ReadLine();
        Console.WriteLine("Enter your last name:");
        string lastName = Console.ReadLine();
        string fullName = "Hello " + firstName + " " + lastName;
        Console.WriteLine(fullName);





        // Task 5: Write a program to take two integer values and return the sum in the output
        Console.WriteLine("Enter the first number:");
        int num1 = int.Parse(Console.ReadLine());
        Console.WriteLine("Enter the second number:");
        int num2 = int.Parse(Console.ReadLine());
        int sum = num1 + num2;
        Console.WriteLine("Output: " + sum);





        // Task 6: Write a program to enter a password and print it as a char array
        Console.WriteLine("Enter your password:");
        char[] password = Console.ReadLine().ToCharArray();
        string passwordString = new string(password);
        Console.WriteLine("Password: " + passwordString);
        
    }
}
