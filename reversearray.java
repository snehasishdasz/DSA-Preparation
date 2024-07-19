import java.util.Scanner;

public class reversearray {

    static void reversearrayy(int arr[],int n){
        int p1 = 0;
        int p2 = n-1;
        int temp;
        while(p1<p2){
             temp = arr[p1];
             arr[p1]=arr[p2];
             arr[p2]=temp;
             p1++;
             p2--;
        }

    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the size of an array: "); 
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the values to the array: "); 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Reverse: "); 
        for (int i = 0; i < arr.length; i++) {

            System.out.print(" "+ arr[i]); 
        }
        reversearrayy(arr, n);
        System.out.print("After Reverse: "); 
        for (int i = 0; i < arr.length; i++) {

            System.out.print(" "+ arr[i]); 
        }

}
}



