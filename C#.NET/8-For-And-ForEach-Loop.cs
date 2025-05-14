using System;

class Program
{
    static void Main()
    {

        
        // 1. Write a program in C# Sharp to display n terms of natural number and their sum.
        Console.WriteLine("Enter number of natural terms you want:");
        int n = int.Parse(Console.ReadLine());
        int sum = 0;
        Console.WriteLine("The first " + n + " natural numbers are:");
        for (int i = 1; i <= n; i++)
        {
            Console.Write(i + " ");
            sum += i;
        }
        Console.WriteLine();
        Console.WriteLine("The Sum of Natural Number up to " + n + " terms : " + sum);





        // 2. Write a program in C# Sharp to display the n terms of odd natural number and their sum.
        Console.WriteLine("\nInput number of odd terms:");
        int oddTerms = int.Parse(Console.ReadLine());
        int oddSum = 0;
        int count = 0;
        int number = 1;
        Console.WriteLine("The odd numbers are:");
        while (count < oddTerms)
        {
            Console.Write(number + " ");
            oddSum += number;
            number += 2;
            count++;
        }
        Console.WriteLine();
        Console.WriteLine("The Sum of odd Natural Number up to " + oddTerms + " terms : " + oddSum);





        // 3. By using Array write the program using For and Foreach loop in C#
        string[] arr = { "JalaTechnologies" };

        Console.WriteLine("\nEnter Array printing using for loop");
        for (int i = 0; i < arr.Length; i++)
        {
            Console.WriteLine(arr[i]);
        }

        Console.WriteLine("Enter Array printing using ForEach loop");
        foreach (string item in arr)
        {
            Console.WriteLine(item);
        }
    }
}
