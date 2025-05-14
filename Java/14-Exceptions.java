import java.io.*;
import java.lang.reflect.*;
import java.sql.SQLException;

public class ExceptionExamples {


    
    // 1. Write a program to generate Arithmetic Exception without exception handling
    public static void arithmeticExceptionWithoutHandling() {
        int a = 5 / 0;
    }






    // 2. Handle the Arithmetic exception using try-catch block
    public static void handleArithmeticException() {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }






    // 3. Write a method which throws exception, Call that method in main class without try block
    public static void methodThrowsException() throws Exception {
        throw new Exception("This is a thrown exception.");
    }






    // 4. Write a program with multiple catch blocks
    public static void multipleCatchBlocks() {
        try {
            int[] arr = new int[2];
            arr[5] = 10;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        } catch (Exception e) {
            System.out.println("General Exception");
        }
    }






    // 5. Write a program to throw exception with your own message
    public static void throwCustomMessage() {
        throw new RuntimeException("This is a custom exception message.");
    }






    // 6. Write a program to create your own exception
    static class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }

    public static void customExceptionDemo() throws MyException {
        throw new MyException("My custom exception occurred.");
    }






    // 7. Write a program with finally block
    public static void finallyBlockDemo() {
        try {
            System.out.println("Try block executed");
        } finally {
            System.out.println("Finally block executed");
        }
    }






    // 8. Write a program to generate Arithmetic Exception
    public static void generateArithmeticException() {
        int x = 10 / 0;
    }






    // 9. Write a program to generate ArrayIndexOutOfBoundException
    public static void generateArrayIndexOutOfBoundsException() {
        int[] arr = new int[2];
        int x = arr[5];
    }






    // 10. Write a program to generate ClassNotFoundException
    public static void generateClassNotFoundException() throws ClassNotFoundException {
        Class.forName("com.unknown.NonExistingClass");
    }






    // 11. Write a program to generate FileNotFoundException
    public static void generateFileNotFoundException() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("nonexistentfile.txt");
    }






    // 12. Write a program to generate IOException
    public static void generateIOException() throws IOException {
        throw new IOException("Generated IOException");
    }






    // 13. Write a program to generate NoSuchFieldException
    public static void generateNoSuchFieldException() throws NoSuchFieldException {
        Class<String> c = String.class;
        Field field = c.getField("nonExistingField");
    }






    // 14. Write a program to generate NoSuchMethodException
    public static void generateNoSuchMethodException() throws NoSuchMethodException {
        Class<String> c = String.class;
        Method method = c.getMethod("nonExistingMethod");
    }






    // 15. Write a program to generate NullPointerException
    public static void generateNullPointerException() {
        String str = null;
        System.out.println(str.length());
    }






    // 16. Write a program to generate NumberFormatException
    public static void generateNumberFormatException() {
        int num = Integer.parseInt("abc");
    }






    // 17. Write a program to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException() {
        String s = "Java";
        char ch = s.charAt(10);
    }






    // 18. Write a program to generate SQLException
    public static void generateSQLException() throws SQLException {
        throw new SQLException("This is a simulated SQL exception.");
    }



    public static void main(String[] args) throws Exception {
        Uncomment any method below to test individually
        arithmeticExceptionWithoutHandling();
        handleArithmeticException();
        methodThrowsException();
        multipleCatchBlocks();
        throwCustomMessage();
        customExceptionDemo();
        finallyBlockDemo();
        generateArithmeticException();
        generateArrayIndexOutOfBoundsException();
        generateClassNotFoundException();
        generateFileNotFoundException();
        generateIOException();
        generateNoSuchFieldException();
        generateNoSuchMethodException();
        generateNullPointerException();
        generateNumberFormatException();
        generateStringIndexOutOfBoundsException();
        generateSQLException();
    }
}
