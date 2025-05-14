// 1. Create an interface with only one method and implement it in a class. Call the method implemented.

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}






// 2. Create an interface with two methods, but implement only one in a class. Call the method implemented.

interface AnimalBehavior {
    void sound();
    void eat();
}

class Dog implements AnimalBehavior {
    public void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}






// 3. Use Interface instances to call the implemented method in the implemented class

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
    }
}






// 4. Create two interfaces with one method each. Implement these two interfaces in one class.

interface Animal {
    void sound();
}

interface Behavior {
    void eat();
}

class Dog implements Animal, Behavior {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats bone");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.eat();
    }
}






// 5. Create two interfaces with the same method (same signature) in both the interfaces. 
// Implement these two interfaces in one class. Call the method.

interface Animal {
    void sound();
}

interface Mammal {
    void sound();
}

class Dog implements Animal, Mammal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}






// 6. Create an interface with a default method and implement it in a class. 
//    Do not provide implementation to the default method and call the method.

interface Animal {
    default void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog implements Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}






// 7. Create an interface and inherit it from the other interface.

interface Animal {
    void sound();
}

interface Mammal extends Animal {
    void feed();
}

class Dog implements Mammal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void feed() {
        System.out.println("Dog feeds puppies");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.feed();
    }
}






// 8. Create a PUBLIC interface with fields and methods, fields should have values assigned. 
// Implement this interface to some class and print the values of the interface fields and call the interface methods

public interface Animal {
    int numberOfLegs = 4;
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Number of legs: " + numberOfLegs);
        dog.sound();
    }
}






// 9. Create a PRIVATE or PROTECTED interface and print the values as above scenario

class OuterClass {
    protected interface Animal {
        void sound();
    }

    class Dog implements Animal {
        public void sound() {
            System.out.println("Dog barks");
        }

        public static void main(String[] args) {
            OuterClass outer = new OuterClass();
            OuterClass.Dog dog = outer.new Dog();
            dog.sound();
        }
    }
}






// 10. Create an interface with private, public and protected fields.

interface Animal {
    public int publicField = 10;
    protected int protectedField = 20;
    private int privateField = 30;
    
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        System.out.println("Public field: " + publicField);
    }
}






// 11. Create an interface with static final variable

interface Animal {
    static final int numberOfLegs = 4;
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Number of legs: " + numberOfLegs);
        dog.sound();
    }
}
