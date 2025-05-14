// 1. Create an abstract class with abstract and non-abstract methods.

abstract class Animal {
    public void sound() {
        System.out.println("Animals make sound");
    }

    public abstract void eat();
}






// 2. Create a sub class for an abstract class. Create an object in the child class for the 
// abstract class and access the non-abstract methods.

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats bone");
    }

    public static void main(String[] args) {
        Dog dog = new Dog(); 
        dog.sound(); 
        dog.eat(); 
    }
}






// 3. Create an instance for the child class in child class and call abstract methods

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }

    public static void main(String[] args) {
        Cat cat = new Cat(); 
        cat.eat(); 
    }
}






// 4. Create an instance for the child class in child class and call non-abstract methods

class Elephant extends Animal {
    @Override
    public void eat() {
        System.out.println("Elephant eats grass");
    }

    public static void main(String[] args) {
        Elephant elephant = new Elephant(); 
        elephant.sound(); 
        elephant.eat(); 
    }
}
