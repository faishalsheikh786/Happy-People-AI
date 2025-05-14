# 1. A, B and C are classes

class A:
    def method1(self):
        print("Method1 of Class A")

    def method2(self):
        print("Method2 of Class A")

    def common_method(self):
        print("Overridden method in Class A")





# 2. A is a super class. B is a sub class of A. C is a sub class of B.

class B(A):
    def method3(self):
        print("Method3 of Class B")

    def method4(self):
        print("Method4 of Class B")

    def common_method(self):
        print("Overridden method in Class B")



class C(B):
    def method5(self):
        print("Method5 of Class C")

    def method6(self):
        print("Method6 of Class C")

    def common_method(self):
        print("Overridden method in Class C")





# 3. Create three methods in each class, 2 methods are specific to each class and third
# method (override method) should be in all three Classes A, B and C

#               (Handled above in class definitions)






# 4. Create a class with main method. Create an object for each class A, B and C in main method and call every
# method of each class using its own object/instance.

def main_methods():
    obj_a = A()
    obj_b = B()
    obj_c = C()

    print("Calling methods from class A:")
    obj_a.method1()
    obj_a.method2()
    obj_a.common_method()

    print("\nCalling methods from class B:")
    obj_b.method1()
    obj_b.method2()
    obj_b.method3()
    obj_b.method4()
    obj_b.common_method()

    print("\nCalling methods from class C:")
    obj_c.method1()
    obj_c.method2()
    obj_c.method3()
    obj_c.method4()
    obj_c.method5()
    obj_c.method6()
    obj_c.common_method()






# 5. Call an overridden method with super class reference to B and C class’s objects

def call_overridden_with_super_ref():
    ref: A = B()
    ref.common_method()

    ref = C()
    ref.common_method()





# 6. Runtime Polymorphism with Data Members/Instance variables, Repeat the above process only for data members

class A_var:
    def __init__(self):
        self.name = "Class A"


class B_var(A_var):
    def __init__(self):
        super().__init__()
        self.name = "Class B"


class C_var(B_var):
    def __init__(self):
        super().__init__()
        self.name = "Class C"


def show_data_members():
    obj_a = A_var()
    obj_b = B_var()
    obj_c = C_var()

    print("\nData Members Output:")
    print("A_var:", obj_a.name)
    print("B_var:", obj_b.name)
    print("C_var:", obj_c.name)

    ref: A_var = B_var()
    print("Super class reference to B_var:", ref.name)

    ref = C_var()
    print("Super class reference to C_var:", ref.name)

main_methods()

call_overridden_with_super_ref()

show_data_members()
