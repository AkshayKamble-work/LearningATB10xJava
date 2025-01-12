package Java.Oops_Akshay.ArraysProgram;

public class Arrays1 {

    public static void main(String[] args) {
        String Car[] = {"Maruthi", "Suzuki", "Mahindra", "Kia", "Honda"};
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        //size of arrays
        System.out.println("Length of Arrays is :: " + arr.length);
        System.out.println("Length of Arrays is :: " + Car.length);
//Accessing Element in arrays
        System.out.println("Element in Arrays is :: ");
        for (int i = 0; i < Car.length; i++) {
            System.out.print(Car[i] + ",");
        }
        System.out.println();
        System.out.println("Element in Arrays is :: ");
//Accessing Element in arrays
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
