package Java.Oops_Akshay.Collections;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ListProgram {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // 1. Add elements to the List
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        System.out.println("Initial List: " + fruits);

        // 2. Add an element at a specific index
        fruits.add(1, "Blueberry");
        System.out.println("After adding 'Blueberry' at index 1: " + fruits);

        // 3. Get an element by index
        String fruit = fruits.get(2);
        System.out.println("Element at index 2: " + fruit);

        // 4. Update an element at a specific index
        fruits.set(3, "Dragonfruit");
        System.out.println("After updating index 3: " + fruits);

        // 5. Remove an element by index
        fruits.remove(4); // Removes "Date"
        System.out.println("After removing element at index 4: " + fruits);

        // 6. Remove an element by value
        fruits.remove("Apple");
        System.out.println("After removing 'Apple': " + fruits);

        // 7. Check if the List contains an element
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("List contains 'Banana': " + containsBanana);

        // 8. Get the size of the List
        int size = fruits.size();
        System.out.println("Size of the List: " + size);

        // 9. Sort the List
        Collections.sort(fruits);
        System.out.println("Sorted List: " + fruits);

        // 10. Iterate over the List
        System.out.println("Iterating over the List:");
        for (String f : fruits) {
            System.out.println(f);
        }

        // 11. Clear the List
        fruits.clear();
        System.out.println("After clearing the List: " + fruits);

        // 12. Check if the List is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the List empty? " + isEmpty);

        // 13. Add all elements from another List
        List<String> newFruits = new ArrayList<>();
        newFruits.add("Mango");
        newFruits.add("Pineapple");
        newFruits.add("Grapes");

        fruits.addAll(newFruits);
        System.out.println("After adding all elements from newFruits: " + fruits);

        // 14. Sublist example
        List<String> subList = fruits.subList(1, 3); // From index 1 to 3 (exclusive)
        System.out.println("SubList (index 1 to 3): " + subList);

        // 15. Convert List to Array
        String[] fruitsArray = fruits.toArray(new String[0]);
        System.out.println("List converted to Array:");
        for (String f : fruitsArray) {
            System.out.println(f);
        }
    }
}




