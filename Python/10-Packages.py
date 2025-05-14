# 1. Create a program to create two classes.
# 1.1. Create a constructor and a method for each class

class ClassA:
    def __init__(self, name):
        self.name = name

    def display(self):
        print(f"Class A: Hello, {self.name}")


class ClassB:
    def __init__(self, age):
        self.age = age

    def display(self):
        print(f"Class B: Your age is {self.age}")




# 1.2. Create a __init__.py for adding all packages

from .class_a import ClassA
from .class_b import ClassB




# 1.3. Import the respective packages

from my_package import ClassA, ClassB




# 1.4. Call each class by creating an object

obj_a = ClassA("John")
obj_b = ClassB(25)

obj_a.display()  
obj_b.display()  


