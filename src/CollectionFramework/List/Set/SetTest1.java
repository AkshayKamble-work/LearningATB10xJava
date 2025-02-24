package CollectionFramework.List.Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetTest1
{

    public static void main(String[] args) {
        Set myset=new HashSet();
        myset.add("Banana");
        myset.add("Blackberry");
        myset.add("Apple");
        myset.add("Mango");
        myset.add(null);// only one null are allowed
        myset.add("Banana"); // Duplicate are not allowed
        myset.add(null);
        System.out.println(myset);
        System.out.println("Size of set is --> "+myset.size());
        System.out.println("Mango is contained ? -->  "+myset.contains("Mango"));
        System.out.println("Set is Empty ? --> "+myset.isEmpty());
        System.out.println("--- Using For Each loop---");



        for (Object num : myset) {
            System.out.print(num+",");
        }
        System.out.println();

    }
}
