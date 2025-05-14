# 1. Write a function to add integer values of an array
def sum_array(arr):
    total = 0
    for num in arr:
        total += num
    return total

print(sum_array([1, 2, 3, 4]))





# 2. Write a function to calculate the average value of an array of integers
def average_array(arr):
    total = 0
    for num in arr:
        total += num
    return total / len(arr)

print(average_array([10, 20, 30]))





# 3. Write a program to find the index of an array element
def find_index(arr, value):
    for i in range(len(arr)):
        if arr[i] == value:
            return i
    return -1

print(find_index([5, 10, 15], 10))





# 4. Write a function to test if array contains a specific value
def contains_value(arr, value):
    for item in arr:
        if item == value:
            return True
    return False

print(contains_value([1, 2, 3], 2))





# 5. Write a function to remove a specific element from an array
def remove_element(arr, value):
    new_arr = []
    for item in arr:
        if item != value:
            new_arr.append(item)
    return new_arr

print(remove_element([1, 2, 3, 2], 2))





# 6. Write a function to copy an array to another array
def copy_array(arr):
    new_arr = []
    for item in arr:
        new_arr.append(item)
    return new_arr

print(copy_array([10, 20, 30]))





# 7. Write a function to insert an element at a specific position in the array
def insert_at_position(arr, index, value):
    arr.insert(index, value)
    return arr

print(insert_at_position([1, 2, 4], 2, 3))





# 8. Write a function to find the minimum and maximum value of an array
def min_max_array(arr):
    minimum = arr[0]
    maximum = arr[0]
    for num in arr:
        if num < minimum:
            minimum = num
        if num > maximum:
            maximum = num
    return minimum, maximum

print(min_max_array([10, 2, 8, 6]))





# 9. Write a function to reverse an array of integer values
def reverse_array(arr):
    return arr[::-1]

print(reverse_array([1, 2, 3, 4]))





# 10. Write a function to find the duplicate values of an array
def find_duplicates(arr):
    duplicates = []
    for i in arr:
        if arr.count(i) > 1 and i not in duplicates:
            duplicates.append(i)
    return duplicates

print(find_duplicates([1, 2, 3, 2, 4, 3]))





# 11. Write a program to find the common values between two arrays
def common_elements(arr1, arr2):
    result = []
    for item in arr1:
        if item in arr2 and item not in result:
            result.append(item)
    return result

print(common_elements([1, 2, 3], [2, 3, 4]))





# 12. Write a method to remove duplicate elements from an array
def remove_duplicates(arr):
    result = []
    for item in arr:
        if item not in result:
            result.append(item)
    return result

print(remove_duplicates([1, 2, 2, 3, 3, 4]))





# 13. Write a method to find the second largest number in an array
def second_largest(arr):
    arr = remove_duplicates(arr)
    arr.sort()
    if len(arr) >= 2:
        return arr[-2]
    return None

print(second_largest([10, 20, 20, 30]))





# 14. Write a method to find the second largest number in an array
print(second_largest([3, 6, 9, 9, 12]))





# 15. Write a method to find number of even number and odd numbers in an array
def count_even_odd(arr):
    even = 0
    odd = 0
    for num in arr:
        if num % 2 == 0:
            even += 1
        else:
            odd += 1
    return even, odd

print(count_even_odd([1, 2, 3, 4, 5]))





# 16. Write a function to get the difference of largest and smallest value
def diff_max_min(arr):
    return max(arr) - min(arr)

print(diff_max_min([10, 5, 20, 3]))





# 17. Write a method to verify if the array contains two specified elements(12,23)
def contains_both(arr):
    return 12 in arr and 23 in arr

print(contains_both([10, 12, 23, 45]))





# 18. Write a program to remove the duplicate elements and return the new array
def remove_duplicates(arr):
    result = []
    for item in arr:
        if item not in result:
            result.append(item)
    return result

print(remove_duplicates([1, 2, 2, 3, 4, 4, 5]))
