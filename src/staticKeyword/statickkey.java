package staticKeyword;

import kotlin.text.UStringsKt;

public class statickkey {

    int x = 100; // non static global
    String s = "java"; // non static global


    public static void main(String[] args) {
        int y = 200; // local varriable
        String name = "C++"; // local varriable
        statickkey sa = new statickkey(); // object creation
        System.out.println(sa.x);  // accessing non static global varriable
        System.out.println(sa.s); // accessing non static global varriable
        //statickkey sa=new statickkey();
        System.out.println(y);
        System.out.println(name);


    }

}
