package CollectionFramework.List.Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_LHS_TRS_HS
{
    public static void main(String[] args) {

        Set myset=new LinkedHashSet();
        myset.add("Mango");
        myset.add("Apple");
        myset.add("Watermelone");
        myset.add("123");
        myset.add(null);// Only one null are allowd
        myset.add("Apple");// Duplicate are not allowed
        myset.add("Cherry");
        myset.add(null);
        System.out.println(myset);

        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        ts.add("Dapple");
        ts.add("Apple");
      // ts.add(null); NullPointerException
       // ts.add(123); //Exception in thread "main" java.lang.ClassCastException: /
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("Apple");
      //  ts.add(null);
//        ts.add(123); // java.lang.ClassCastException
        //ts.add(null); // java.lang.NullPointerException
        System.out.println(ts);

        System.out.println("---Tree Set---");
        System.out.println(" ----- For Each ---- ");

        for(Object o:ts){
            System.out.println(o);
        }

    }
}
