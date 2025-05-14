using System;

class Program
{
    static void Main()
    {

        
        // 1. Write a program to Implicit Type Conversion
        Console.WriteLine("Enter Int value:");
        int intVal = int.Parse(Console.ReadLine());
        long longVal = intVal;
        Console.WriteLine("Int value - " + intVal);
        Console.WriteLine("Long value - " + longVal);





        // 2. Write an example of explicit type conversion
        Console.WriteLine("Enter Value of I:");
        double doubleVal = double.Parse(Console.ReadLine());
        int i = (int)doubleVal;
        Console.WriteLine("Value of I is " + i);





        // 3. Write a program of built-in type conversion methods
        Console.WriteLine("Enter string name:");
        string str = Console.ReadLine();
        Console.WriteLine("Enter Integer value:");
        string intStr = Console.ReadLine();

        float strToFloat = Convert.ToSingle("34.6");
        int intNum = Convert.ToInt32(intStr);
        double intToDouble = Convert.ToDouble(intNum);

        Console.WriteLine("string to float - " + strToFloat);
        Console.WriteLine("int to double - " + intToDouble);





        // 4. Write a program that converts various value types to string type
        Console.WriteLine("Enter Integer value:");
        int num = int.Parse(Console.ReadLine());
        Console.WriteLine("Enter Float Value:");
        float floatNum = float.Parse(Console.ReadLine());

        string intAsString = num.ToString();
        string floatAsString = floatNum.ToString();

        Console.WriteLine("int.ToString() - " + intAsString);
        Console.WriteLine("float.ToString() - " + floatAsString);
    }
}
