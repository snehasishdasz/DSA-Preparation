package Java_Code;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array1[] = new int[size];

        //For array inputs
        for(int i=0;i<size;i++){
            array1[i] =  sc.nextInt();
        }
        
        //For Output
        for(int i=0;i<size;i++){
            System.out.println(array1[i]);
        }
    }
}



