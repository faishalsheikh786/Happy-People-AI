# 1. Write a program to generate Arithmetic Exception without exception handling
x = 10
y = 0
result = x / y







# 2. Handle the Arithmetic exception using try-catch block
try:
    x = 10
    y = 0
    result = x / y
except ZeroDivisionError as e:
    print(f"Error: {e}")






# 3. Write a method which throws exception, Call that method in main class without try block
def throw_exception():
    raise ValueError("This is a custom exception")

throw_exception()






# 4. Write a program with multiple catch blocks
try:
    x = 10
    y = 0
    result = x / y 
except ZeroDivisionError as e:
    print(f"Catch ZeroDivisionError: {e}")
except Exception as e:
    print(f"Catch General Exception: {e}")






# 5. Write a program to throw exception with your own message
try:
    raise ValueError("This is my custom exception message")
except ValueError as e:
    print(f"Caught exception: {e}")





# 6. Write a program to create your own exception
class MyCustomException(Exception):
    def __init__(self, message):
        self.message = message
        super().__init__(self.message)

try:
    raise MyCustomException("This is my custom exception")
except MyCustomException as e:
    print(f"Caught MyCustomException: {e}")





# 7. Write a program with finally block
try:
    print("Trying to execute code.")
    result = 10 / 2
    print(f"Result: {result}")
except ZeroDivisionError as e:
    print(f"Error: {e}")
finally:
    print("This will always execute regardless of an exception.")





# 8. Write a program to generate Arithmetic Exception
x = 10
y = 0
try:
    result = x / y
except ZeroDivisionError as e:
    print(f"Error: {e}")





# 9. Write a program to generate FileNotFoundException
try:
    with open("non_existing_file.txt", "r") as file:
        content = file.read()
except FileNotFoundError as e:
    print(f"File not found: {e}")





# 10. Write a program to generate ClassNotFoundException
try:
    __import__("NonExistentClass")
except ImportError as e:
    print(f"Class not found: {e}")





# 11. Write a program to generate IOException
try:
    with open("non_existing_file.txt", "r") as file:
        content = file.read()
except IOError as e:
    print(f"I/O Error: {e}")





# 12. Write a program to generate NoSuchFieldException
class MyClass:
    def __init__(self):
        self.name = "John"

obj = MyClass()
try:
    print(obj.age) 
except AttributeError as e:
    print(f"Error: {e}")
