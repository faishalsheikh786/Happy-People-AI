using System;

class Program
{
    static void Main()
    {

        
        // 1. Write a C# Sharp program to check whether a given number is positive or negative.
        Console.WriteLine("Enter a number:");
        int num = int.Parse(Console.ReadLine());
        if (num > 0)
            Console.WriteLine(num + " is a positive number");
        else if (num < 0)
            Console.WriteLine(num + " is a negative number");
        else
            Console.WriteLine("The number is zero");





        // 2. Write a C# Sharp program to find whether a given year is a leap year or not.
        Console.WriteLine("Enter a year:");
        int year = int.Parse(Console.ReadLine());
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            Console.WriteLine(year + " is leap year");
        else
            Console.WriteLine(year + " is not leap year");





        // 3. Write a C# Sharp program to check whether an alphabet is a vowel or consonant.
        Console.WriteLine("Enter any alphabet:");
        char ch = char.ToLower(Console.ReadKey().KeyChar);
        Console.WriteLine();
        if (ch >= 'a' && ch <= 'z')
        {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                Console.WriteLine("The alphabet is a vowel.");
            else
                Console.WriteLine("The alphabet is a consonant.");
        }
        else
        {
            Console.WriteLine("Invalid input. Not an alphabet.");
        }
    }
}
