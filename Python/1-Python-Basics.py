# 1. Write a program to print your name
print("Hello World!")  




# 2. Write a program for a Single line comment and multi-line comments

# This is a single line comment

"""
This is a multi-line comment
It can span multiple lines
Useful for documentation or long explanations
"""




# 3. Define variables for different Data Types and print on the Console

int_var = 10               
bool_var = True            
char_var = 'A'             
float_var = 3.14          
double_var = 3.1415926535  

print("Integer:", int_var)
print("Boolean:", bool_var)
print("Character:", char_var)
print("Float:", float_var)
print("Double (float in Python):", double_var)




# 4. Define local and Global variables with the same name and print both

var = "Global Variable"

def my_function():
    var = "Local Variable"
    print("Inside the function, var =", var)

my_function()
print("Outside the function, var =", var)
