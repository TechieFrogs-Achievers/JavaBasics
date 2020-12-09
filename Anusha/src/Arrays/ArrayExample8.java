package Arrays;
import java.util.*;
public class ArrayExample8 
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
     System.out.println(" print the elements of an array present on odd position");    
   //check odd positions
   for(int i=0;i<arr1.length;i=i+2)
    {
       System.out.println(arr1[i]);
    }
   } 
}
