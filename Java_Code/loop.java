package Java_Code;
import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) { // Start the loop from 1, not 0
            sum = sum + i;
        }
        System.out.println("Sum of " + n + " natural numbers is: " + sum);
    }
}
