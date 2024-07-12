import java.util.*;

public class function{
    // public static void printmyName(String name){
    //     System.out.println(name);
    //     return;
    // }
    // public static int calculateSum(int a,int b){
    //     int sum = a+b;
    //     return sum;
    // }

    public static void printFactorial(int n){

        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for(int i = 1; i<=n;i++ ){
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // String name = sc.next();
        // printmyName(name);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        // System.out.println("Sum of 2 no is :"+ sum);

        int n = sc.nextInt();
        printFactorial(n);
    }
}