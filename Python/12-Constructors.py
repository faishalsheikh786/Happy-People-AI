# 1. Write a class with a default constructor, one argument constructor, and two argument constructors.

class MyClass:
    def __init__(self):
        print("Default Constructor called")
    
    def __init__(self, arg1):
        self.arg1 = arg1
        print(f"Constructor with one argument called: {arg1}")
    
    def __init__(self, arg1, arg2):
        self.arg1 = arg1
        self.arg2 = arg2
        print(f"Constructor with two arguments called: {arg1}, {arg2}")

def main():
    obj1 = MyClass()
    obj2 = MyClass(10)
    obj3 = MyClass(10, 20)

main()





# 2. Call the constructors (both default and argument constructors) of super class from a child class

class SuperClass:
    def __init__(self):
        print("SuperClass Default Constructor called")
    
    def __init__(self, value):
        self.value = value
        print(f"SuperClass Constructor with one argument called: {value}")


class SubClass(SuperClass):
    def __init__(self):
        super().__init__()
        print("SubClass Default Constructor called")
    
    def __init__(self, value):
        super().__init__(value)
        print(f"SubClass Constructor with argument called: {value}")

def main():
    obj1 = SubClass(10)

main()





# 3. Apply private, public, protected, and default access modifiers to the constructor

class AccessModifiers:
    def __init__(self):
        print("Public Constructor called")
    
    def _protected_method(self):
        print("Protected Constructor called")
    
    def __private_method(self):
        print("Private Constructor called")
    

def main():
    obj = AccessModifiers()
    obj.__private_method() 
    obj._protected_method()
    obj.__init__() 

main()





# 4. Write a program which illustrates the concept of attributes of a constructor.

class ConstructorAttributes:
    def __init__(self, name, age):
        self.name = name  
        self.age = age 
        print(f"Name: {self.name}, Age: {self.age}")

def main():
    obj = ConstructorAttributes("John", 25)

main()
