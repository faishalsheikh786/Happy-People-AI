import java.util.*;

public class ArrayExamples {


    
    // 1. Write a function to add integer values of an array
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }






    // 2. Write a function to calculate the average value of an array of integers
    public static double averageArray(int[] arr) {
        return (double) sumArray(arr) / arr.length;
    }






    // 3. Write a program to find the index of an array element
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }






    // 4. Write a function to test if array contains a specific value
    public static boolean containsValue(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) return true;
        }
        return false;
    }






    // 5. Write a function to remove a specific element from an array
    public static int[] removeElement(int[] arr, int element) {
        return Arrays.stream(arr).filter(e -> e != element).toArray();
    }






    // 6. Write a function to copy an array to another array
    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }






    // 7. Write a function to insert an element at a specific position in the array
    public static int[] insertElement(int[] arr, int index, int element) {
        int[] result = new int[arr.length + 1];
        for (int i = 0, j = 0; i < result.length; i++) {
            if (i == index) result[i] = element;
            else result[i] = arr[j++];
        }
        return result;
    }






    // 8. Write a function to find the minimum and maximum value of an array
    public static int[] findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }






    // 9. Write a function to reverse an array of integer values
    public static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }






    // 10. Write a function to find the duplicate values of an array
    public static Set<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }






    // 11. Write a program to find the common values between two arrays
    public static Set<Integer> findCommon(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) set1.add(num);
        Set<Integer> common = new HashSet<>();
        for (int num : arr2) if (set1.contains(num)) common.add(num);
        return common;
    }






    // 12. Write a method to remove duplicate elements from an array
    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }






    // 13. Write a method to find the second largest number in an array
    public static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }






    // 14. Write a method to find the second largest number in an array
    public static int findSecondLargestAgain(int[] arr) {
        return findSecondLargest(arr);
    }






    // 15. Write a method to find number of even number and odd numbers in an array
    public static int[] countEvenOdd(int[] arr) {
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        return new int[]{even, odd};
    }






    // 16. Write a function to get the difference of largest and smallest value
    public static int differenceMinMax(int[] arr) {
        int[] minMax = findMinMax(arr);
        return minMax[1] - minMax[0];
    }






    // 17. Write a method to verify if the array contains two specified elements(12,23)
    public static boolean containsTwoElements(int[] arr, int a, int b) {
        boolean foundA = false, foundB = false;
        for (int num : arr) {
            if (num == a) foundA = true;
            if (num == b) foundB = true;
        }
        return foundA && foundB;
    }






    // 18. Write a program to remove the duplicate elements and return the new array
    public static int[] removeDuplicatesAgain(int[] arr) {
        return removeDuplicates(arr);
    }






    // 19. Write a function to find the missing number of sorted array of 1 to 100
    public static int findMissingNumber(int[] arr) {
        int expectedSum = 100 * 101 / 2;
        int actualSum = Arrays.stream(arr).sum();
        return expectedSum - actualSum;
    }





    public static void main(String[] args) {
        int[] array = {12, 23, 45, 12, 67, 23, 89, 90};

        System.out.println("Sum: " + sumArray(array));
        System.out.println("Average: " + averageArray(array));
        System.out.println("Index of 45: " + findIndex(array, 45));
        System.out.println("Contains 23: " + containsValue(array, 23));
        System.out.println("Array after removing 23: " + Arrays.toString(removeElement(array, 23)));
        System.out.println("Copy of array: " + Arrays.toString(copyArray(array)));
        System.out.println("Insert 99 at index 2: " + Arrays.toString(insertElement(array, 2, 99)));
        System.out.println("Min & Max: " + Arrays.toString(findMinMax(array)));
        System.out.println("Reversed array: " + Arrays.toString(reverseArray(array)));
        System.out.println("Duplicates: " + findDuplicates(array));
        System.out.println("Common values: " + findCommon(array, new int[]{23, 67, 88}));
        System.out.println("Removed duplicates: " + Arrays.toString(removeDuplicates(array)));
        System.out.println("Second largest: " + findSecondLargest(array));
        System.out.println("Even & Odd count: " + Arrays.toString(countEvenOdd(array)));
        System.out.println("Difference of max & min: " + differenceMinMax(array));
        System.out.println("Contains 12 and 23: " + containsTwoElements(array, 12, 23));
        System.out.println("Removed duplicates again: " + Arrays.toString(removeDuplicatesAgain(array)));

        int[] arrMissing = new int[99];
        for (int i = 0, j = 1; j <= 100; j++) {
            if (j != 57) arrMissing[i++] = j;
        }
        System.out.println("Missing number: " + findMissingNumber(arrMissing));
    }
}
