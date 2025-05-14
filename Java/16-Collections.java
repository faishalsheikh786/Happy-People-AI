import java.util.*;

public class CollectionExamples {


    
    // 1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to 
    // ArrayList and perform the below operations 
    public static void arrayListOperations() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine", "Ten"));

        list.add("Eleven");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        list.add(2, "Inserted");
        list.remove("Five");
        list.remove(3);
        list.set(1, "Updated-Two");
        System.out.println("Element at index 2: " + list.get(2));
        String element = list.get(4);
        System.out.println("Element at index 4: " + element);
        System.out.println("Size of ArrayList: " + list.size());
        System.out.println("Contains 'Ten': " + list.contains("Ten"));
        list.clear();
        System.out.println("ArrayList after clear: " + list);
    }






    // 2. Create a HashMap with at least 10 key value pairs of the Student ID and Name 
    public static void hashMapOperations() {
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eva");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Helen");
        studentMap.put(109, "Ivy");
        studentMap.put(110, "John");
        studentMap.put(111, "Kevin");
        System.out.println("Student ID 103: " + studentMap.get(103));
        HashMap<Integer, String> clonedMap = new HashMap<>(studentMap);
        System.out.println("Contains key 104: " + studentMap.containsKey(104));
        System.out.println("Contains value 'Alice': " + studentMap.containsValue("Alice"));
        System.out.println("Is map empty: " + studentMap.isEmpty());
        System.out.println("Map size: " + studentMap.size());
        System.out.println("Keys: " + studentMap.keySet());
        System.out.println("Values: " + studentMap.values());
        studentMap.remove(105);
        HashMap<Integer, String> copiedMap = new HashMap<>();
        copiedMap.putAll(studentMap);
        System.out.println("Copied Map: " + copiedMap);
    }






    // 3. Create a HashSet with at least 10 elements of type String 
    public static void hashSetOperations() {
        HashSet<String> set = new HashSet<>(Arrays.asList(
                "Red", "Green", "Blue", "Yellow", "Black",
                "White", "Orange", "Purple", "Pink", "Gray"));
        set.add("Brown");
        System.out.println("Contains 'Green': " + set.contains("Green"));
        set.remove("Pink");
        System.out.println("Size: " + set.size());
        for (String color : set) {
            System.out.println(color);
        }
        String[] colorArray = set.toArray(new String[0]);
        System.out.println("Converted to array: " + Arrays.toString(colorArray));
        set.clear();
        System.out.println("HashSet after clear: " + set);
    }

    public static void main(String[] args) {
        arrayListOperations();
        System.out.println("----------");
        hashMapOperations();
        System.out.println("----------");
        hashSetOperations();
    }
}
