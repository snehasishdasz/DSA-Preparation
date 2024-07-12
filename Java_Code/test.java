package Java_Code;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int num = n;
        int temp;
    	int armst = 0;
    
    while(n>0)
    {
         temp=n%10;
        armst=(armst)+(temp*temp*temp);
        n=n/10;
    }
System.out.println(armst);
    }
}



