package InterviewQuestions.StartProgram;

public class NumberInvertedPyamid {
/*

00000000010
000000009
00000008
0000007
000006
00005
0004
003
02
1
 */
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println(n-i);
        }
    }
}
