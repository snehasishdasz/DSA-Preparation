package Java_Code;
/*Java Program to find the second largest and second smallest elements in the array using Functions*/
import java.util.Scanner;
import java.util.*;

public class SecondLargestandSmallest
{
    static void findLargest(int arr[], int n)      //Method to find the second largest and second smallest element
     {
        
       Arrays.sort(arr);   //Sorts the array in ascending order
        
        System.out.println("Second Largest element is "+arr[n-2]);  //Display Second Smallest
        System.out.println("Second Smallest element is "+arr[1]);  //Display Second Largest
         
     }
     
     public static void main(String []args)
     {
         Scanner sc=new Scanner(System.in);
         int n;     //Declare array size
         System.out.println("Enter the size of the array");
         n=sc.nextInt();   //Initialize array size
         
         int arr[]=new int[n];   //Declare array 
        System.out.println("Enter the array");  
        for(int i=0;i<n;i++)     //Initialize array
        {
            arr[i]=sc.nextInt();
        }
               
        findLargest(arr,n);  //Function Call
        
    }
}