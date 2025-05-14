// 1. Write two methods with the same name but different number of parameters of same type and call the methods from main method

class OverloadExample1 {
    void display(int a) {
        System.out.println("One parameter: " + a);
    }

    void display(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        OverloadExample1 obj = new OverloadExample1();
        obj.display(10);
        obj.display(10, 20);
    }
}






// 2. Write two methods with the same name but different number of parameters of different data type 
//    and call the methods from main method

class OverloadExample2 {
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(String b) {
        System.out.println("String: " + b);
    }

    public static void main(String[] args) {
        OverloadExample2 obj = new OverloadExample2();
        obj.show(100);
        obj.show("Java");
    }
}








// 3. Write two methods with the same name and same number of parameters of same type and call from main method










// 4. Write two methods with the same name and same number of parameters of different type and call from main method

class OverloadExample4 {
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(double b) {
        System.out.println("Double: " + b);
    }

    public static void main(String[] args) {
        OverloadExample4 obj = new OverloadExample4();
        obj.display(10);
        obj.display(3.14);
    }
}
