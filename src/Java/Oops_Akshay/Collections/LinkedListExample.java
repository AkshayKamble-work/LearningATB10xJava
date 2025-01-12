package Java.Oops_Akshay.Collections;


import java.util.LinkedList;
import java.util.*;

    public class LinkedListExample {
        public static void main(String[] args) {
            // 1. Create a LinkedList
            LinkedList<String> cities = new LinkedList<>();

            // 2. Add elements to the LinkedList
            cities.add("New York");
            cities.add("London");
            cities.add("Tokyo");
            cities.add("Sydney");
            System.out.println("Initial LinkedList: " + cities);

            // 3. Add elements at specific positions
            cities.addFirst("Mumbai");
            cities.addLast("Paris");
            System.out.println("After adding elements at first and last: " + cities);

            // 4. Get elements
            String firstCity = cities.getFirst();
            String lastCity = cities.getLast();
            System.out.println("First city: " + firstCity);
            System.out.println("Last city: " + lastCity);

            // 5. Remove elements
            cities.removeFirst(); // Removes "Mumbai"
            cities.removeLast();  // Removes "Paris"
            System.out.println("After removing first and last elements: " + cities);

            // 6. Add elements at specific index
            cities.add(1, "Berlin");
            System.out.println("After adding 'Berlin' at index 1: " + cities);

            // 7. Remove elements by index and by value
            cities.remove(2); // Removes "Tokyo"
            cities.remove("London"); // Removes "London"
            System.out.println("After removing elements: " + cities);

            // 8. Check if the LinkedList contains an element
            boolean containsSydney = cities.contains("Sydney");
            System.out.println("Contains 'Sydney': " + containsSydney);

            // 9. Get the size of the LinkedList
            int size = cities.size();
            System.out.println("Size of the LinkedList: " + size);

            // 10. Sort the LinkedList
            Collections.sort(cities);
            System.out.println("Sorted LinkedList: " + cities);

            // 11. Iterate over the LinkedList
            System.out.println("Iterating over the LinkedList:");
            for (String city : cities) {
                System.out.println(city);
            }

            // 12. Clear the LinkedList
            cities.clear();
            System.out.println("After clearing the LinkedList: " + cities);

            // 13. Check if the LinkedList is empty
            boolean isEmpty = cities.isEmpty();
            System.out.println("Is the LinkedList empty? " + isEmpty);

            // 14. Add all elements from another LinkedList
            LinkedList<String> newCities = new LinkedList<>();
            newCities.add("San Francisco");
            newCities.add("Dubai");
            newCities.add("Amsterdam");

            cities.addAll(newCities);
            System.out.println("After adding all elements from newCities: " + cities);

            // 15. Reverse the LinkedList
            Collections.reverse(cities);
            System.out.println("Reversed LinkedList: " + cities);
        }
    }


