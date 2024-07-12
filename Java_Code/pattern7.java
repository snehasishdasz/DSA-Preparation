package Java_Code;
import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        //outer loop
       for(int i = 1; i<=2*n-1;i++) {

        int star = i;
        if(i>n) star = 2*n-i;

             //inner loop for space
            for(int j= 1; j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
