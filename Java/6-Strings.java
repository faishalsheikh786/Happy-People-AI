public class StringExamples {

    
    // 1. Different ways creating a string
    public static void createStrings() {
        String str1 = "Hello";
        String str2 = new String("World");
        char[] chars = {'J', 'a', 'v', 'a'};
        String str3 = new String(chars);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }






    // 2. Concatenating two strings using + operator
    public static void concatenateStrings() {
        String a = "Hello";
        String b = "World";
        String result = a + " " + b;
        System.out.println(result);
    }






    // 3. Finding the length of the string
    public static void stringLength() {
        String str = "Bright IT Career";
        System.out.println("Length: " + str.length());
    }







    // 4. Extract a string using Substring
    public static void extractSubstring() {
        String str = "Java Programming";
        String sub = str.substring(5, 16);
        System.out.println("Substring: " + sub);
    }







    // 5. Searching in strings using indexOf()
    public static void searchIndex() {
        String str = "Learn Java Programming";
        int index = str.indexOf("Java");
        System.out.println("Index of 'Java': " + index);
    }







    // 6. Matching a String Against a Regular Expression With matches()
    public static void regexMatch() {
        String email = "test@example.com";
        System.out.println(email.matches("\\w+@\\w+\\.com"));
    }






    // 7. Comparing strings using the methods equals()
    public static void compareEquals() {
        String str1 = "Java";
        String str2 = "Java";
        System.out.println(str1.equals(str2));
    }






    // 8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
    public static void compareMore() {
        String str1 = "Java";
        String str2 = "java";
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.startsWith("Ja"));
        System.out.println(str1.endsWith("va"));
        System.out.println(str1.compareTo(str2)); // returns non-zero due to case
    }






    // 9. Trimming strings with trim()
    public static void trimString() {
        String str = "   Java Trim Example   ";
        System.out.println("Before: '" + str + "'");
        System.out.println("After: '" + str.trim() + "'");
    }






    // 10. Replacing characters in strings with replace()
    public static void replaceCharacters() {
        String str = "I love Java";
        String result = str.replace("Java", "Python");
        System.out.println(result);
    }






    // 11. Splitting strings with split()
    public static void splitString() {
        String str = "Java,Python,C++,JavaScript";
        String[] parts = str.split(",");
        for (String lang : parts) {
            System.out.println(lang);
        }
    }






    // 12. Converting Numbers to Strings with valueOf()
    public static void numberToString() {
        int number = 100;
        String str = String.valueOf(number);
        System.out.println("Converted: " + str);
    }






    // 13. Converting integer objects to Strings
    public static void integerToString() {
        Integer num = 123;
        String str = num.toString();
        System.out.println("Integer to String: " + str);
    }






    // 14. Converting to uppercase and lowercase
    public static void changeCase() {
        String str = "Java Programming";
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }



    public static void main(String[] args) {
        createStrings();
        concatenateStrings();
        stringLength();
        extractSubstring();
        searchIndex();
        regexMatch();
        compareEquals();
        compareMore();
        trimString();
        replaceCharacters();
        splitString();
        numberToString();
        integerToString();
        changeCase();
    }
}
