package Arrays;
import java.util.*;
public class ArrayExample22 
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
    //Odd numbers
     System.out.println("Odd numbers: "); 
      for(int i=0;i<size;i++)
      {
        if(arr1[i]%2!=0)
      {
        System.out.println(arr1[i]);
      }   
   
      }
    //Even numbers
      System.out.println("Even numbers: "); 
      for(int i=0;i<size;i++)
      {
        if(arr1[i]%2==0)
      {
        System.out.println(arr1[i]);
      }   
      }
    }
}
