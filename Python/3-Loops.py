# 1. Write a program to print “Bright IT Career” ten times using for loop
for i in range(10):
    print("Bright IT Career")





# 2. Write a program to print 1 to 20 numbers using the while loop
i = 1
while i <= 20:
    print(i)
    i += 1





# 3. Program to equal operator and not equal operators
a = 10
b = 20
print(a == b)
print(a != b)





# 4. Write a program to print the odd and even numbers
for i in range(1, 21):
    if i % 2 == 0:
        print(i, "is Even")
    else:
        print(i, "is Odd")





# 5. Write a program to print largest number among three numbers
a = 5
b = 12
c = 9
if a > b and a > c:
    print("Largest is", a)
elif b > c:
    print("Largest is", b)
else:
    print("Largest is", c)





# 6. Write a program to print even number between 10 and 20 using while
i = 10
while i <= 20:
    if i % 2 == 0:
        print(i)
    i += 1





# 7. Write a program to print 1 to 10 using the do-while loop statement
i = 1
while True:
    print(i)
    i += 1
    if i > 10:
        break





# 8. Write a program to find Armstrong number or not
num = 153
sum = 0
temp = num
while temp > 0:
    digit = temp % 10
    sum += digit ** 3
    temp //= 10
if sum == num:
    print("Armstrong number")
else:
    print("Not an Armstrong number")





# 9. Write a program to find the prime or not
num = 7
is_prime = True
if num <= 1:
    is_prime = False
for i in range(2, num):
    if num % i == 0:
        is_prime = False
        break
if is_prime:
    print("Prime number")
else:
    print("Not a prime number")





# 10. Write a program to palindrome or not
num = 121
if str(num) == str(num)[::-1]:
    print("Palindrome")
else:
    print("Not a palindrome")





# 11. Program to check whether a number is EVEN or ODD using switch
num = 6
match num % 2:
    case 0:
        print("Even number")
    case 1:
        print("Odd number")





# 12. Print gender (Male/Female) program according to given M/F using switch
gender = 'M'
match gender.upper():
    case 'M':
        print("Male")
    case 'F':
        print("Female")
    case _:
        print("Invalid input")
