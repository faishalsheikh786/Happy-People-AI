public class JavaBasics {


    
    // 1. How to create a class, object, method and its signature
    public class ExampleClass {
        public void printMessage() {
            System.out.println("Hello from the method!");
        }
    }
    
    public static void main(String[] args) {
        ExampleClass obj = new JavaBasics().new ExampleClass();
        obj.printMessage();
    }





    // 2. Write a program to print your name.
    public static void printName() {
        System.out.println("Your Name");
    }





    // 3. Write a program for a Single line comment, multi-line and documentation comments.

    public static void commentsExample() {

        // This is a single-line comment
        System.out.println("This is a single-line comment");


        /* This is a multi-line comment
           It spans multiple lines */
        System.out.println("This is a multi-line comment");


        /**
         * This is a documentation comment.
         * It is used for generating documentation.
         * The following code prints a message to the console.
         */
        System.out.println("This is a documentation comment example");
    }





    // 4. Define variables for different Data Types int, Boolean, char, float, double and print on the Console
    public static void dataTypesExample() {
        int myInt = 10;
        boolean myBoolean = true;
        char myChar = 'A';
        float myFloat = 10.5f;
        double myDouble = 20.99;

        System.out.println("Integer: " + myInt);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("Character: " + myChar);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
    }





    // 5. Define the local and Global variables with the same name and print both variables and understand the scope of the variables
    static int myVar = 100;

    public static void variableScopeExample() {
        int myVar = 50;

        System.out.println("Local variable: " + myVar);
        System.out.println("Global variable: " + JavaBasics.myVar);
    }




    
    // 6. Write a function to print your name and call the function from main method.
    public static void callFunctionToPrintName() {
        printName();
    }

}
