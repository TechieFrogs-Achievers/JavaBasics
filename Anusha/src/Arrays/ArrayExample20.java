package Arrays;
import java.util.*;
public class ArrayExample20 
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
     int min=arr1[0];//initialize min with first element of array
     for(int i=0;i<arr1.length;i++)
     {
         //compare elements in the array
         if(arr1[i]<min)
         min=arr1[i];
     }
     System.out.println("Smallest element present is: "+min);
   } 
}
