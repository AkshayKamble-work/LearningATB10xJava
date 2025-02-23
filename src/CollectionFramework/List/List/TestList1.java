package CollectionFramework.List.List;

import java.util.ArrayList;

public class TestList1
{
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("Akshay");
        list.add("Ranjeet");
        list.add("Ketan");
        list.add("Ashwini");
        list.add(null);// Null are allowed
        list.add("123");
        list.add("Akshay");// Duplicate are allowed and insertion order is maintained
        System.out.println("My Array list --> "+list);
        System.out.println("Array list is Empty --> "+list.isEmpty());
        System.out.println("Remove element using index order --> "+list.remove(2));
        System.out.println("After removing the element "+list);

    }


}
