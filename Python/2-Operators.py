# 1. Write a function for arithmetic operators (+, -, *, /)
def arithmetic_operations(a, b):
    print("Addition:", a + b)
    print("Subtraction:", a - b)
    print("Multiplication:", a * b)
    if b != 0:
        print("Division:", a / b)
    else:
        print("Division: Cannot divide by zero")

arithmetic_operations(10, 5)




# 2. Write a method for increment and decrement operators (++, --)

def increment_decrement(value):
    print("Original value:", value)
    value += 1
    print("After increment:", value)
    value -= 2
    print("After decrement:", value)

increment_decrement(10)




# 3. Write a program to find if two numbers are equal or not

def check_equality(x, y):
    if x == y:
        print(f"{x} and {y} are equal.")
    else:
        print(f"{x} and {y} are not equal.")

check_equality(10, 10)
check_equality(10, 15)




# 4. Program for relational operators (<, <=, >, >=)

def relational_operators(a, b):
    print(f"{a} < {b}:", a < b)
    print(f"{a} <= {b}:", a <= b)
    print(f"{a} > {b}:", a > b)
    print(f"{a} >= {b}:", a >= b)

relational_operators(10, 20)




# 5. Print the smaller and larger number

def find_min_max(a, b):
    if a < b:
        print(f"Smaller number: {a}")
        print(f"Larger number: {b}")
    elif a > b:
        print(f"Smaller number: {b}")
        print(f"Larger number: {a}")
    else:
        print("Both numbers are equal.")

find_min_max(25, 40)
