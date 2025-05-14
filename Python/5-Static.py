# 1. Define a static variable and access that through a class
class MyClass:
    static_var = 10

print(MyClass.static_var)





# 2. Define a static variable and access that through an instance
class MyClass:
    static_var = 20

obj = MyClass()
print(obj.static_var)





# 3. Define a static variable and change within the instance
class MyClass:
    static_var = 30

obj = MyClass()
obj.static_var = 99  
print("Instance:", obj.static_var)
print("Class:", MyClass.static_var)





# 4. Define a static variable and change within the class
class MyClass:
    static_var = 40

MyClass.static_var = 100  
print(MyClass.static_var)
