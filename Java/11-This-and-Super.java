// 1. Print the fields/instance members of the current class using this and without using object

class Animal {
    String name = "Dog";

    public void printName() {
        System.out.println("Using this: " + this.name);
        System.out.println("Without object: " + name);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.printName();
    }
}






// 2. Print the fields/instance members of the parent class using super

class Animal {
    String name = "Dog";
}

class Dog extends Animal {
    String name = "Bulldog";

    public void printName() {
        System.out.println("Child class name: " + this.name);
        System.out.println("Parent class name using super: " + super.name);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printName();
    }
}






// 3. Call constructor of the current class using this()

class Animal {
    public Animal() {
        System.out.println("Animal class constructor");
    }
}

class Dog extends Animal {
    public Dog() {
        this("Bulldog");
        System.out.println("Dog class constructor");
    }

    public Dog(String name) {
        System.out.println("Dog name: " + name);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}






// 4. Call argument constructor of current class using this()

class Animal {
    public Animal(String name) {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal {
    public Dog() {
        this("Bulldog");
        System.out.println("Dog class constructor");
    }

    public Dog(String name) {
        super(name);
        System.out.println("Dog name: " + name);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}






// 5. Call constructor of the parent class using super()

class Animal {
    public Animal() {
        System.out.println("Animal class constructor");
    }
}

class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("Dog class constructor");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}






// 6. Use this() and super() in methods not in constructors

class Animal {
    String name = "Dog";

    public void printDetails() {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal {
    String name = "Bulldog";

    public void printDetails() {
        super.printDetails(); 
        System.out.println("Dog name: " + this.name); 
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printDetails();
    }
}
