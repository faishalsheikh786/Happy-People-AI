# 1. Write two methods with the same name but different number of parameters of same type and call the methods
def greet(name):
    print(f"Hello, {name}!")

def greet(name, age):
    print(f"Hello, {name}! You are {age} years old.")

greet("Alice")
greet("Bob", 25)





# 2. Write two methods with the same name but different number of parameters of different data type and call the methods
def display_info(name, age):
    print(f"Name: {name}, Age: {age}")

def display_info(name, age, is_student):
    print(f"Name: {name}, Age: {age}, Student: {is_student}")

display_info("Alice", 25)
display_info("Bob", 30, True)





# 3. Write two methods with the same name and same number of parameters of same type
def add(x, y):
    return x + y

def add(x, y):
    return x * y

print(add(5, 10)) 
