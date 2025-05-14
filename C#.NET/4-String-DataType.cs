using System;

class Program
{
    static void Main()
    {


        // Task 1: Write a Program to Reverse a String without using Reverse function
        Console.WriteLine("Enter a String:");
        string input1 = Console.ReadLine();
        string reversed = "";
        for (int i = input1.Length - 1; i >= 0; i--)
        {
            reversed += input1[i];
        }
        Console.WriteLine("Reverse String is: " + reversed);





        // Task 2: Write a program in C# Sharp to find the length of a string without using library function
        Console.WriteLine("Enter a String:");
        string input2 = Console.ReadLine();
        int length = 0;
        foreach (char c in input2)
        {
            length++;
        }
        Console.WriteLine("Output: " + length);





        // Task 3: Write a Program to calculate the length of the string using count function
        Console.WriteLine("Enter a String:");
        string input3 = Console.ReadLine();
        int count = input3.Length;
        Console.WriteLine("The Length of the First String is: " + count);





        // Task 4: Write a Program to Replace String in String using Replace function
        string sentence = "Sun Rises in the West";
        string replaced = sentence.Replace("West", "East");
        Console.WriteLine("Sentence Before Replacing: " + sentence);
        Console.WriteLine("Sentence After Replacing: " + replaced);





        // Task 5: Write a Program to Convert Upper case to Lower Case using LowerCase method
        Console.WriteLine("Enter the String in Uppercase:");
        string upper = Console.ReadLine();
        string lower = upper.ToLower();
        Console.WriteLine("String in Lowercase: " + lower);





        // Task 6: Write a program in C# Sharp to find maximum occurring character in a string
        Console.WriteLine("Input string:");
        string input6 = Console.ReadLine();
        int[] freq = new int[256];
        foreach (char c in input6)
        {
            freq[c]++;
        }
        int max = 0;
        char maxChar = ' ';
        for (int i = 0; i < 256; i++)
        {
            if (freq[i] > max)
            {
                max = freq[i];
                maxChar = (char)i;
            }
        }
        Console.WriteLine("The highest frequency of the character '" + maxChar + "' appear as " + max + " time");



        

        // Task 7: Write a program in C# Sharp to sort a string array in ascending order
        Console.WriteLine("Enter a string:");
        string input7 = Console.ReadLine();
        char[] chars = input7.Replace(" ", "").ToCharArray();
        Array.Sort(chars);
        Console.Write("After sorting the string appears like: ");
        foreach (char c in chars)
        {
            Console.Write(c + " ");
        }
    }
}
