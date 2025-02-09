package Arrayss;

public class Max_Min_Arrays {
    public static void main(String[] args) {

        int a[] = {1, 20, 30, 40, 100, 101};
        int max = 0;
        int min = 0;
        for (int i = 0; i < a.length; i++) {
            max = a[0];
            min = a[0];
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Max " + max);
        System.out.println("Min " + min);
    }
}
