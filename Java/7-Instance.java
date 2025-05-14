// 1. A, B and C are classes
// 2. A is a super class. B is a sub class of A. C is a sub class of B.  

class A {
    public void methodA() {
        System.out.println("Method A in class A");
    }

    public void anotherMethodA() {
        System.out.println("Another method in class A");
    }

    public void overriddenMethod() {
        System.out.println("Overridden method in class A");
    }
}






// 3. Create three methods in each class, 2 methods are specific to each class and third 
// method (override method) should be in all three Classes A, B and C

class B extends A {
    public void methodB() {
        System.out.println("Method B in class B");
    }

    public void anotherMethodB() {
        System.out.println("Another method in class B");
    }

    @Override
    public void overriddenMethod() {
        System.out.println("Overridden method in class B");
    }
}

class C extends B {
    public void methodC() {
        System.out.println("Method C in class C");
    }

    public void anotherMethodC() {
        System.out.println("Another method in class C");
    }

    @Override
    public void overriddenMethod() {
        System.out.println("Overridden method in class C");
    }
}






// 4. Create a class with main method. Create an object for each class A, B and C in main 
// method and call every method of each class using its own object/instance.

public class MainClass {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        objA.methodA();
        objA.anotherMethodA();
        objA.overriddenMethod();

        objB.methodB();
        objB.anotherMethodB();
        objB.overriddenMethod();

        objC.methodC();
        objC.anotherMethodC();
        objC.overriddenMethod();
    }
}






// 5. Call an overridden method with super class reference to B and C class’s objects

public class MainClass {
    public static void main(String[] args) {
        A referenceToB = new B(); 
        A referenceToC = new C(); 

        System.out.println("\nCalling overridden method with superclass reference:");
        referenceToB.overriddenMethod();
        referenceToC.overriddenMethod(); 
    }
}






// 6. Runtime Polymorphism with Data Members/Instance variables, Repeat the above 
// process only for data members

public class MainClass {
    public static void main(String[] args) {
        A referenceToDataB = new B(); 
        A referenceToDataC = new C(); 

        System.out.println("\nDemonstrating Runtime Polymorphism with Data Members:");
        referenceToDataB.overriddenMethod(); 
        referenceToDataC.overriddenMethod(); 
    }
}
