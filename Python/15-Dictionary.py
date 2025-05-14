# 1. Create a Dictionary with at least 5 key value pairs of the Student ID and Name

student_dict = {
    101: "Alice",
    102: "Bob",
    103: "Charlie",
    104: "David",
    105: "Eve"
}

print("Student Dictionary:", student_dict)





# 1.1. Adding the values in dictionary

student_dict[106] = "Frank"
print("Updated Student Dictionary after adding:", student_dict)





# 1.2. Updating the values in dictionary

student_dict[103] = "Chuck"
print("Updated Student Dictionary after updating:", student_dict)





# 1.3. Accessing the value in dictionary

student_name = student_dict[102]
print(f"Student with ID 102 is {student_name}")





# 1.4. Create a nested loop dictionary

nested_dict = {
    101: {"Name": "Alice", "Age": 21, "Grade": "A"},
    102: {"Name": "Bob", "Age": 22, "Grade": "B"},
    103: {"Name": "Charlie", "Age": 23, "Grade": "A"},
    104: {"Name": "David", "Age": 24, "Grade": "C"},
    105: {"Name": "Eve", "Age": 25, "Grade": "B"}
}

print("Nested Dictionary:", nested_dict)





# 1.5. Access the values of nested loop dictionary

student_info = nested_dict[102]
print("Student ID 102 info:", student_info)

name_of_student = nested_dict[103]["Name"]
print(f"Name of student with ID 103: {name_of_student}")





# 1.6. Print the keys present in a particular dictionary

print("Keys of the Student Dictionary:", student_dict.keys())
print("Keys of the Nested Dictionary:", nested_dict.keys())





# 1.7. Delete a value from a dictionary

del student_dict[105] 
print("Student Dictionary after deletion:", student_dict)
