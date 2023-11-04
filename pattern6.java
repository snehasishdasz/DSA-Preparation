import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        //outer loop
       for(int i = 1; i<=n;i++) {

            //inner loop for space
            for(int j= 1; j<=i;j++){
                System.out.print(" ");
            }
            //inner loop for star
            for(int j=1;j<=2*n-(2*i-1);j++){
                System.out.print("*");
            }

             //inner loop for space
            for(int j= 1; j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
