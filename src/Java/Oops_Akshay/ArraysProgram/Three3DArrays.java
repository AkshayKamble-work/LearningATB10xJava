package Java.Oops_Akshay.ArraysProgram;

import java.util.Arrays;

public class Three3DArrays {

    public static void main(String[] args) {
        int[][][] threeDArray = {
                { {22, 23, 24}, {25, 26, 27} },
                { {28, 29, 30}, {10, 11, 12} },
                { {13, 14, 15}, {16, 17, 18},{19,20,21} }
        };

        // Get the size of each dimension
        int x = threeDArray.length;            // Number of 2D arrays
        int y = threeDArray[0].length;         // Number of rows in each 2D array
        int z = threeDArray[0][0].length;      // Number of columns in each row

        System.out.println("Dimensions of the 3D array:");
        System.out.println("X (2D arrays): " + x);
        System.out.println("Y (Rows): " + y);
        System.out.println("Z (Columns): " + z);

        System.out.println("\nContents of the 3D array:");

        for (int i = 0; i <threeDArray.length ; i++)
        {
            for (int j = 0; j <threeDArray[i].length; j++)
            {
                for (int k = 0; k < threeDArray.length; k++)
                {

                    System.out.print(threeDArray[i][j][k]+"|");

                }
                System.out.println();
            }
        }
    }
}
