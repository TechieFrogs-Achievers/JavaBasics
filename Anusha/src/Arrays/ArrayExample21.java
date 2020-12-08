package Arrays;
import java.util.*;
public class ArrayExample21 
{
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner(System.in);//scanner class
    System.out.println("Enter size of array : ");
    int size = sc.nextInt();
    int []arr1 = new int[size];
    System.out.println("Enter the elements:");    
    for (int i = 0; i < size; i++)//print values
     {  
        arr1[i] = sc.nextInt();             
     } 
     System.out.println("Duplicate elements in given array:"); 
     //searches for duplicate elents
     for( int i=0;i< arr1.length;i++)
     {
         for(int j=i+1;j<arr1.length;j++)
         {
             if(arr1[i]==arr1[j])
             {
                  System.out.println(arr1[j]);
             }
             
         }
     }
   } 
}
