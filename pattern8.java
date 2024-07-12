import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        //outer loop
        // for(int i=1;i<=n;i++)
        // {
        //     //inner loop
        //     for(int j=1;j<=i;j++)
        //     {
        //        int sum=i+j;
        //         if(sum % 2 == 0)
        //         {
        //             //even
        //             System.out.print("1 ");
        //         }
        //         else{

        //             //odd
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }

        //  for(int i=1;i<=n;i++)
        // {
        //     //inner loop 1st part
        //     for(int j=1;j<=i;j++)
        //     {
        //        System.out.print("*");
        //     }
        //     if(i==6){
        //         for(int j=4;j>=1;j--){
        //             System.out.print("*");
        //         }
        //     }
        for(int i=1;i<=n;i++)
        {
            int start = 1;
            if(i%2==0){
                start = 0;
            }
            else{
                start = 1;
            }
            for(int j=1 ; j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
            // for(int j=1;j<=2*i-1;j++)
            // {
            //    System.out.print("*");;
            // }
            // for(int j=1;j<n-i;j++)
            // {
            //    System.out.print(" ");;
            // }
            
        }
    }
    

