import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int remainder = 0;
		int reverse = 0;
		// int num = n;
		while(n!=0){
			remainder = n % 10;
			reverse = reverse * 10 +remainder;
			n = n/10;
		}
		System.out.println(reverse);
    }
}
