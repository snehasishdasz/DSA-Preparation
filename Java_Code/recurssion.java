package Java_Code;
import java.util.*;

public class recurssion{


    //Sum of n numbers
// return 1 + 2 + 3 + .......... + (n-1) + n
    // public static int sum_n(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     int left_part = sum_n(n-1);
    //     return left_part + n;
    // }


    //Sum of digits
    //12143
    //1 + 2 + 1 + 4 + 3
    // public static int sum_digits(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     int last_digit = n % 10;
    //     int remaining = n / 10;
    //     System.out.println(remaining + " " + last_digit);
    //     return sum_digits(remaining)+ last_digit;
    // }

    public static pattern_print(int n){
        pattern_print(n-1);
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    //    System.out.println(sum_n(n)); 
    // System.out.println(sum_digits(n));
    }
}