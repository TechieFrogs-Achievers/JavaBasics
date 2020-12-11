import java.util.*;
public class String2 
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);        //create scanner class object
       
        System.out.println("Enter any size : ");

        int size = sc.nextInt();                //read the size from user

        String arr[] = new String [size];      // creating an object for an array
        
        for(int i = 0; i < size ; i++ )
        {
            arr[i] = sc.next();                // initialize the array
        }
         System.out.println("Entered array");
        
        //loop to print entered array

         for(int i = 0 ; i < size ; i++ )
        {
            System.out.print(" " + arr[i]);        
        }
        
        // comparing two words in an array  to get lexicographic order
        
        for(int i = 0 ; i < size ; i++)
        {
            for(int j = i+1 ; j < size ; j++ )
            {
                if(arr[i].compareTo(arr[j]) > 0)   
                {
                    String temp = arr[i];
                    arr[i] = arr[j];               
                    arr[j] = temp ;
                }
            }
        }
        System.out.println();
       
        System.out.println("The required output is : ");
        //loop to print the array after arranging
        
        for(int i = 0 ; i < size ; i++)
        {
            System.out.print(" " + arr[i]);         
        }
        sc.close();
    }
}
