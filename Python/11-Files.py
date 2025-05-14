# 1. Write a program to read a text file

try:
    with open('example.txt', 'r') as file:
        content = file.read()
        print(content)
except FileNotFoundError:
    print("File not found!")





# 2. Write a program to write text to .txt file using InputStream

text = input("Enter text to write to file: ")

with open('output.txt', 'w') as file:
    file.write(text)
    print("Text written to file successfully.")





# 3. Write a program to read a file stream

with open('example.txt', 'rb') as file:
    file_stream = file.read()
    print(file_stream)





# 4. Write a program to read a file stream that supports random access

with open('example.txt', 'r+b') as file:
    file.seek(0)  
    data = file.read(10)  
    print(data)
    file.seek(10)
    data = file.read(10)
    print(data)





# 5. Write a program to read a file and adjust to a particular index using seek()

with open('example.txt', 'r+b') as file:
    file.seek(5) 
    data = file.read(5)  
    print(data)





# 6. Write a program to check whether a file is having read access and write access permissions

import os

file_path = 'example.txt'

if os.access(file_path, os.R_OK):
    print("File has read access.")
else:
    print("File does not have read access.")

if os.access(file_path, os.W_OK):
    print("File has write access.")
else:
    print("File does not have write access.")
