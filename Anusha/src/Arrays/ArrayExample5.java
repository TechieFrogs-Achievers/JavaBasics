package Arrays;
import java.util.*;
public class ArrayExample5 
{
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);//scanner class object
    System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int []arr1 = new int[size];
        System.out.println("Enter the elements:"); 
        for (int i = 0; i < size; i++)//print the elements in array
         {  
            arr1[i] = sc.nextInt();   
                      
        }      
         //Displaying elements of array arr1     
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr1.length; i++) 
        {     
           System.out.print(arr1[i] + " ");    
        }     
    }
}
