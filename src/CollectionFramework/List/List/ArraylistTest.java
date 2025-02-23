package CollectionFramework.List.List;

import java.util.ArrayList;

public class ArraylistTest
{
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("Chery");
        list.add("Banana");
        list.add("Mango");
        list.add("Chikhu");
        list.add("Oreange");
        list.add("Apple");
        list.add("Pappaya");
        list.add("Cherry");
        System.out.println("Array list elements -->"+list);
        System.out.println("Accessing Random element using Lastindex of method --> "+list.lastIndexOf("Apple"));

        System.out.println("Array List is empty? --> "+list.isEmpty());
        System.out.println("Array list contain the Apple element --> "+list.contains("Apple"));
        System.out.println("Accessing Random element using index of method"+list.indexOf("Chikhu"));
        System.out.println("Size of Array list is --> "+list.size());
        System.out.println("Priting the Array list element using for loop");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i)+",");
        }



    }
}
