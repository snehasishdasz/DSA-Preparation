package Java_Code;
import java.util.Scanner;

public class numberofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int cnt = 0;
        while( n > 0 ){
        //    long lastdigit = x % 10;
            n = n/10;
            cnt = cnt + 1;
        }
        System.out.println("Number of digits in this above number is : "+cnt);
    }
}
