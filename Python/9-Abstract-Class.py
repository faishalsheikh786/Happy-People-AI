# 1. Create an abstract class with abstract and non-abstract methods.

from abc import ABC, abstractmethod

class AbstractClass(ABC):
    @abstractmethod
    def abstract_method(self):
        pass
    
    def non_abstract_method(self):
        print("This is a non-abstract method in the abstract class.")




# 2. Create a sub class for an abstract class. Create an object in the child class for the abstract class and access the non-abstract methods

class ChildClass(AbstractClass):
    def abstract_method(self):
        print("This is the implementation of the abstract method.")

child = ChildClass()
child.non_abstract_method()




# 3. Create an instance for the child class in child class and call abstract methods

class AnotherChildClass(AbstractClass):
    def abstract_method(self):
        print("This is another implementation of the abstract method.")
    
    def call_abstract_method(self):
        self.abstract_method()

another_child = AnotherChildClass()
another_child.call_abstract_method()




# 4. Create an instance for the child class in child class and call non-abstract methods

class ThirdChildClass(AbstractClass):
    def abstract_method(self):
        print("ThirdChildClass implementation of the abstract method.")
    
    def call_non_abstract_method(self):
        self.non_abstract_method()

third_child = ThirdChildClass()
third_child.call_non_abstract_method()
