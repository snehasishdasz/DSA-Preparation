package Java_Code;
import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        //outer loop
       for(int i = 1; i<=n;i++) {

            //inner loop for space
            for(int j= 1; j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop for star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

             //inner loop for space
            // for(int j= 1; j<=n-i;j++){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
    }
}
