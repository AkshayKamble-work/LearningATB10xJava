package Java.StartProgram;

public class Diamond {
    /*
         *
        ***
       *****
      *******
     *********
      *******
       *****
        ***
         *
     */
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=2*n-1;i++)
        {
            int row=(i<=n)?i:(2*n-i);
            System.out.print(" ".repeat(n-row));
            System.out.println("*".repeat(2*row-1));
        }
    }
}
