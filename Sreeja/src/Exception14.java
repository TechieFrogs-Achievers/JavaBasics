import java.util.*;
public class Exception14 
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);            //create scanner class object
        System.out.println("Enter size - interger only");

        int size = sc.nextInt();        //initialize the size value
        int arr[] = new int[5];         //create array to store entered elements

        //code to be checked for an exception

        try
        {
            System.out.println("Enter array elements");
            for(int i = 0 ; i < size ; i++)         //loop to initialize the rray elements from user
            {
                arr[i] = sc.nextInt();
            }
            
            System.out.println("The array is");
            for(int i = 0 ; i < size ; i++)         //loop to print the array elements
            {
                System.out.print(" "+arr[i]);
            }
        }
        catch(IndexOutOfBoundsException e)                  //to handle the exception
        {
            System.out.println("enter valid size");
        }
        sc.close();


       

        
    }
}
