package Arrays;
import java.util.*;
public class ArrayExample18 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);//scanner method
    System.out.println("Enter size of array : ");
    int size = sc.nextInt();
    int []arr1 = new int[size];
    System.out.println("Enter the elements:"); 
    for (int i = 0; i < size; i++)//print the elements
     {  
        arr1[i] = sc.nextInt();            
     }  
     int max=arr1[0];//initialize max with first element of array
     for(int i=0;i<arr1.length;i++)
     {
         //compare elements in the array
         if(arr1[i]>max)
         max=arr1[i];
     }
     System.out.println("Largest element present is: "+max);
    }
}
