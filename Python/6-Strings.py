# 1. Different ways creating a string
str1 = "Hello"
str2 = str("World")
str3 = '''Multi-line
String'''
print(str1, str2, str3)





# 2. Concatenating two strings using + operator
a = "Good"
b = "Morning"
result = a + " " + b
print(result)





# 3. Finding the length of the string
text = "Python"
print(len(text))





# 4. Extract a string using Substring
word = "Programming"
print(word[0:6]) 





# 5. Searching in strings using index()
text = "Python Programming"
print(text.index("Program"))





# 6. Matching a String Against a Regular Expression With matches()
import re
text = "abc123"
match = re.fullmatch(r"[a-z]+\d+", text)
print(match is not None)





# 7. Comparing strings
str1 = "hello"
str2 = "Hello"
print(str1 == str2)





# 8. startsWith(), endsWith() and compareTo()
text = "hello world"
print(text.startswith("hello"))
print(text.endswith("world"))
print((text > "hi") - (text < "hi"))  





# 9. Trimming strings with strip()
text = "   padded text   "
print(text.strip())





# 10. Replacing characters in strings with replace()
text = "banana"
print(text.replace("a", "@"))





# 11. Splitting strings with split()
text = "apple,banana,orange"
print(text.split(","))





# 12. Converting integer objects to Strings
num = 123
str_num = str(num)
print(str_num)





# 13. Converting to uppercase and lowercase
text = "Python"
print(text.upper())
print(text.lower())
