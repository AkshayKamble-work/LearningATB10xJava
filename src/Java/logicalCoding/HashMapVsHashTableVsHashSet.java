package Java.logicalCoding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.*;

public class HashMapVsHashTableVsHashSet {

    public static void main(String[] args) {

        //----------hashtable -------------------------
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(101, " ajay");
        ht.put(101, "Vijay");
        ht.put(102, "Ravi");
        ht.put(103, "Rahul");
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m : ht.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //----------------hashmap--------------------------------
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(104, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");

        System.out.println("-----------Hash map-----------");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("-----------Hash set-----------");
        // Instantiate an object of HashSet
        HashSet<String> hs = new HashSet<>();

        // Adding elements
        hs.add("Hello");
        hs.add("Hi");
        hs.add("Bye");
        hs.add("Hello");// Duplicate value are not allow


        // Printing the Size and Element of HashSet
        System.out.println("HashSet Size: " + hs.size());
        System.out.println("Elements in HashSet: " + hs);
    }

}
