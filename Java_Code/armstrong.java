import java.util.Scanner;
import java.lang.Math;  
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int num = n;
        int count=0;
        int sum=0;
        int last=0;
    while(num>0)
    {
         num = num/10;
          count= count+1;
    }
    num = n;
    while(num>0){
        last = num % 10;
        sum = (int) (sum + (Math.pow(last,count)));
        num = num / 10;
    }
    if(sum == n){
        System.out.println("Armstrong");
    }
    else{
        System.out.println("Not armstrong");
    }
    }
}



