import java.util.*;
public class ArraysEx38 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);            //create scanner class object

        System.out.println("Enter size of the array");

        int size = sc.nextInt();            //read size from user

        int arr[] = new int[size];          //create array to store the entered elements

        System.out.println("Enter  integer array elements");

        //loop to get the array elements from user

        for(int i = 0 ; i < size ; i++)
        {
          arr[i] = sc.nextInt();  
        }

        int sum = 0;

        //loop to add all the elements in an array

        for(int i = 0 ; i < size ; i++)
        {
            sum = sum+arr[i];
        }

        System.out.println(sum);

        double average = sum/size;          //to calculate average
        
        System.out.println("Average of elements in an array"+" "+average);
        sc.close();
  
    }
   
   


    
}
