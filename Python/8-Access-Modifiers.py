# 1. Create a class with PRIVATE fields, private method and a main method.
# Print the fields in main method. Call the private method in main method. 
# Create a sub class and try to access the private fields and methods from sub class.

class A:
    def __init__(self):
        self.__private_field = "This is a private field"
    
    def __private_method(self):
        print("This is a private method.")
    
    def access_private(self):
        print(self.__private_field)
        self.__private_method()

class Main:
    def main(self):
        obj = A()
        obj.access_private()

        class SubClass(A):
            def try_access_private(self):
                print(self.__private_field)

        subclass_obj = SubClass()

main_obj = Main()
main_obj.main()




# 2. Create a class with PROTECTED fields and methods.
# Access these fields and methods from any other class in the same package.
# Also, Access the PROTECTED fields and methods from child class located in a different package 
# Access the PROTECTED fields and methods from any class in different package.

class A:
    def __init__(self):
        self._protected_field = "This is a protected field"
    
    def _protected_method(self):
        print("This is a protected method.")

class B:
    def access_protected(self):
        obj = A()
        print(obj._protected_field)
        obj._protected_method()

class C(A):
    def access_protected_from_subclass(self):
        print(self._protected_field)
        self._protected_method()

class Main:
    def main(self):
        obj_b = B()
        obj_b.access_protected()
        
        obj_c = C()
        obj_c.access_protected_from_subclass()

main_obj = Main()
main_obj.main()




# 3. Create a class with PUBLIC fields and methods.
# Access the public methods and fields from any class in the same package or different package.

class A:
    def __init__(self):
        self.public_field = "This is a public field"
    
    def public_method(self):
        print("This is a public method.")

class B:
    def access_public(self):
        obj = A()
        print(obj.public_field)
        obj.public_method()

class C(A):
    def access_public_from_subclass(self):
        print(self.public_field)
        self.public_method()

class Main:
    def main(self):
        obj_b = B()
        obj_b.access_public()
        
        obj_c = C()
        obj_c.access_public_from_subclass()

main_obj = Main()
main_obj.main()
