using System;

class Program
{
    static void Main()
    {


        //1.  Declare a variable of type int with name empID
        int empID;





        //2.  Declare a variable of type string with name empName
        string empName;





        //3.  Assign a value 5 for empID and print the value
        empID = 5;
        Console.WriteLine("empID: " + empID); 





        //4.  Assign a value "Puja" for empName and print the value
        empName = "Faishal";
        Console.WriteLine("empName: " + empName);  





        //5.  Write a program to check whether a number is odd or even
        Console.WriteLine("Enter a number to check if it is odd or even:");
        int number = int.Parse(Console.ReadLine()); 

        if (number % 2 == 0)
        {
            Console.WriteLine("Output: even");
        }
        else
        {
            Console.WriteLine("Output: odd");   
        }






        // Task 6: Write a program to swap 2 numbers
        Console.WriteLine("Enter the first number:");
        int num1 = int.Parse(Console.ReadLine());  

        Console.WriteLine("Enter the second number:");
        int num2 = int.Parse(Console.ReadLine());  


        int temp = num1;
        num1 = num2;
        num2 = temp;

        Console.WriteLine("Output: " + num1 + "," + num2); 
        
    }
}
