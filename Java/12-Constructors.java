// 1. Write a class with a default constructor, one argument constructor and two argument constructors. 
//  Instantiate the class to call all the constructors of that class from a main class.

class MyClass {
    MyClass() {
        System.out.println("Default constructor called");
    }

    MyClass(int a) {
        System.out.println("One argument constructor called with value: " + a);
    }

    MyClass(int a, String b) {
        System.out.println("Two argument constructor called with values: " + a + " and " + b);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(10);
        MyClass obj3 = new MyClass(10, "Hello");
    }
}






// 2. Call the constructors (both default and argument constructors) of super class from a child class

class Animal {
    Animal() {
        System.out.println("Animal class default constructor");
    }

    Animal(String name) {
        System.out.println("Animal class constructor with name: " + name);
    }
}

class Dog extends Animal {
    Dog() {
        super();  
        System.out.println("Dog class default constructor");
    }

    Dog(String name) {
        super(name); 
        System.out.println("Dog class constructor with name: " + name);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Bulldog");
    }
}






// 3. Apply private, public, protected and default access modifiers to the constructor

class MyClass {
    private MyClass() {
        System.out.println("Private constructor");
    }

    public MyClass(int a) {
        System.out.println("Public constructor with value: " + a);
    }

    protected MyClass(String name) {
        System.out.println("Protected constructor with name: " + name);
    }

    MyClass(double value) {
        System.out.println("Default constructor with value: " + value);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        MyClass obj2 = new MyClass("Hello");
        MyClass obj3 = new MyClass(3.14);
    }
}






// 4. Write constructors with return type int and String

class MyClass {
    MyClass() {
        System.out.println("Constructor without return type");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
    }
}






// 5. Try to call the constructor multiple times with the same object

class MyClass {
    MyClass() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();  
        obj = new MyClass();  
        obj = new MyClass();  
    }
}
