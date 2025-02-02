package Java.basic.casting;

import java.util.Arrays;

public class StringConncepts {

    public static void main(String[] args) {

        String str1 = "Hello";                    // Creates or reuses "Hello" in the String pool
        String str2 = "Hello";                    // Reuses the "Hello" from the String pool
        String str3 = new String("Hello"); // Creates a new object on the heap

        System.out.println(str1 == str2);  // true, both refer to the same object in the pool
        System.out.println(str1 == str3);  // false, str3 is a new object in the heap
        System.out.println(str1.equals(str3));  // true, because the content is the same

        // Practice
        String name = "Akshay";
        String name2 = "Kamble";

        // 1. charAt()
        System.out.println(name.charAt(3));

        // 2. concat()
        System.out.println(name.concat(" kamble"));

        // 3. contains()
        System.out.println(name.contains("Akshay"));

        // 4. equals()
        System.out.println(name.equals("akshay"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("Akshay"));

        // 6. indexOf()
        System.out.println(name.indexOf('h'));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('y', 'K'));

        // 9. split()

        String name4 = "Selenium Java";
        String[] split = name4.split(" ");
        System.out.println(Arrays.toString(split));
        System.out.println(split[0]);
        System.out.println(split[1]);

        // 10. substring( , )
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("JAVA".toLowerCase());

        // 12. toUpperCase()
        System.out.println("selenium".toUpperCase());

        // 13. replaceAll()
        System.out.println(name2.replaceAll(" ", " Python "));

        // 14. startsWith()
        System.out.println(name.startsWith("A"));

        // 15. endsWith()
        System.out.println(name.endsWith("y"));

        // 16. isEmpty()
        System.out.println(name.isEmpty());

        // 17. trim()
        String name3 = "    Rest Assured     ";
        System.out.println(name3.trim());

        // 18. compareTo()
        System.out.println(name.compareTo("Java"));

        // 19. compareToIgnoreCase()
        System.out.println(name.compareToIgnoreCase("JAVA"));

        // 20. lastIndexOf()
        System.out.println(name.lastIndexOf("V"));

        // 21. repeat()
        System.out.println(name.repeat(2));

        StringBuilder stringBuilder = new StringBuilder("Rest");
        stringBuilder.append("Assured");
        System.out.println(stringBuilder);


        StringBuilder sb = new StringBuilder("Hi");
        sb.append(" It's my World!");
        System.out.println(sb.toString());

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);


    }
}
