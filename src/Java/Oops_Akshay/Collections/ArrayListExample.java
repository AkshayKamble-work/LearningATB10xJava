package Java.Oops_Akshay.Collections;


import java.util.ArrayList;
import java.util.*;
class ArrayListExample
{
    public static void main(String[] args)
    {
        // 1. Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        System.out.println("Initial ArrayList: " + fruits);

        // 3. Add an element at a specific index
        fruits.add(1, "Blueberry");
        System.out.println("After adding 'Blueberry' at index 1: " + fruits);

        // 4. Get an element by index
        String fruit = fruits.get(2);
        System.out.println("Element at index 2: " + fruit);

        // 5. Update an element at a specific index
        fruits.set(3, "Dragonfruit");
        System.out.println("After updating index 3: " + fruits);

        // 6. Remove an element by index
        fruits.remove(4); // Removes "Date"
        System.out.println("After removing element at index 4: " + fruits);

        // 7. Remove an element by value
        fruits.remove("Apple");
        System.out.println("After removing 'Apple': " + fruits);

        // 8. Check if the ArrayList contains an element
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("ArrayList contains 'Banana': " + containsBanana);

        // 9. Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the ArrayList: " + size);

        // 10. Sort the ArrayList
        Collections.sort(fruits);
        System.out.println("Sorted ArrayList: " + fruits);

        // 11. Iterate over the ArrayList
        System.out.println("Iterating over the ArrayList:");
        for (String f : fruits) {
            System.out.println(f);
        }

        // 12. Clear the ArrayList
        fruits.clear();
        System.out.println("After clearing the ArrayList: " + fruits);

        // 13. Check if the ArrayList is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);

        // 14. Add all elements from another ArrayList
        ArrayList<String> newFruits = new ArrayList<>();
        newFruits.add("Mango");
        newFruits.add("Pineapple");
        newFruits.add("Grapes");

        fruits.addAll(newFruits);
        System.out.println("After adding all elements from newFruits: " + fruits);

        // 15. Sublist example
        ArrayList<String> subList = new ArrayList<>(fruits.subList(1, 3)); // From index 1 to 3 (exclusive)
        System.out.println("SubList (index 1 to 3): " + subList);

        // 16. Convert ArrayList to Array
        String[] fruitsArray = fruits.toArray(new String[0]);
        System.out.println("ArrayList converted to Array:");
        for (String f : fruitsArray) {
            System.out.println(f);
        }

        // 17. Reverse the ArrayList
        Collections.reverse(fruits);
        System.out.println("Reversed ArrayList: " + fruits);

    }
}