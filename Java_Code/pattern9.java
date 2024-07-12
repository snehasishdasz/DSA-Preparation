package Java_Code;
import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

       
        //outer loop
        for(int i=1;i<=n;i++)
        {
            //inner loop for number
            for(int j=1;j<=i;j++)
            {
               System.out.print(j);
            }
            //for space 
            int start = 2*(n-i);
            for(int j=1;j<=start;j++)
            {
               System.out.print(" ");
            }

            //for number
            for(int j=i;j>=1;j--)
            {
               System.out.print(j);
            }
            System.out.println();
        }
    }
}
