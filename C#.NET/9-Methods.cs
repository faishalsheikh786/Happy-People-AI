using System;

class Program
{

    // 2. Write a program on static and instance methods in c#
    static void StaticMethod()
    {
        Console.WriteLine("This is a static method.");
    }

    void InstanceMethod()
    {
        Console.WriteLine("This is an instance method.");
    }





    // 3. Write a method of Calculator and print sum and product in c#
    static void Calculator(int a, int b)
    {
        int sum = a + b;
        int product = a * b;
        Console.WriteLine("sum = " + sum + " and product = " + product);
    }





    // 4. Write a program using parameter arrays and print output in console in c#
    static void PrintParams(params int[] numbers)
    {
        Console.WriteLine("Values in params array:");
        foreach (int num in numbers)
        {
            Console.Write(num + " ");
        }
        Console.WriteLine();
    }






    // 5. Write a program to print entered number of even numbers in c#
    static void PrintEvenNumbers(int count)
    {
        int num = 2;
        int printed = 0;
        while (printed < count)
        {
            Console.Write(num + " ");
            num += 2;
            printed++;
        }
        Console.WriteLine();
    }




    

    static void Main()
    {


        // 1. Write a program using WriteLine(Boolean) method in c#
        bool isAvailable = true;
        Console.WriteLine(isAvailable);






        // 2. Call static and instance methods
        StaticMethod();
        Program obj = new Program();
        obj.InstanceMethod();





        // 3. Call Calculator method
        Console.WriteLine("Enter two values:");
        int a = int.Parse(Console.ReadLine());
        int b = int.Parse(Console.ReadLine());
        Calculator(a, b);





        // 4. Call method using parameter arrays
        PrintParams(1, 2, 3, 4, 5);





        // 5. Call method to print even numbers
        Console.WriteLine("Enter number of even numbers to print:");
        int evenCount = int.Parse(Console.ReadLine());
        PrintEvenNumbers(evenCount);
    }
}
