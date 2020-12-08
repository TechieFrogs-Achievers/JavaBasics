package Arrays;
import java.util.*;
public class ArrayExample1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);//scanner class 
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();//array size take from console
        int []arr1 = new int[size];
        int arr2[] = new int[arr1.length];

        //display array elements and copy the elements
        System.out.println("Enter the elements:");    
        for (int i = 0; i < size; i++)
         {  
            arr1[i] = sc.nextInt();   
            arr2[i] = arr1[i];  
             
        }      
         //Displaying elements of array arr1     
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr1.length; i++) 
        {     
           System.out.print(arr1[i] + " ");    
        }     
            
        System.out.println();    
            
        //Displaying copying elements of array arr2     
        System.out.println("Elements of new array: ");    
        for (int i = 0; i < arr2.length; i++) 
        {     
           System.out.print(arr2[i] + " ");    
        }    
   sc.close();
    }
}
