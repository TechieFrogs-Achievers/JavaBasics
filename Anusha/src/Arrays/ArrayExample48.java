package Arrays;
import java.util.*;
public class ArrayExample48 
{
  public static void main(String[] args)
  {
   
   boolean foundnum=false;
   Scanner sc = new Scanner(System.in);//scanner method
     System.out.println("Enter size of array : ");
     int size = sc.nextInt();
     int []arr1 = new int[size];
     System.out.println("Enter the elements:");
     for (int i = 0; i < size; i++)//print the elements
      {  
        arr1[i] = sc.nextInt();        
      } 
      System.out.println("enter find number is: ");//enter found number
      int found=sc.nextInt();
      for(int n:arr1)//check the number in given array
      {
          if(n==found)
          {
              foundnum=true;
              break;
          }
      }
      if(foundnum)
          System.out.println(found+" is found");
      else
         System.out.println(found+" is not found");
      
  }  
}
