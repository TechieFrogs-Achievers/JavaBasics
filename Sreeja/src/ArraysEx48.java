import java.util.*;
public class ArraysEx48
 {
     public static void main(String[] args) 
     {
        int arr[] = {1,2,2,3,4,5};          //initializing the array

        Scanner sc = new Scanner(System.in);        //create scanner class object

        System.out.println("Enter any value");

        int sample = sc.nextInt();              //read the value from user

        int count = 0;

        //loop to check the given value with array elements
        
        for (int i = 0 ; i < arr.length ; i++)          
        {
            if(arr[i]==sample)
            {
                count++;
            }
        }

        //condition to check the the value is present or not

        if(count>0)
            {
                System.out.println("Given value is present in an array");
            }
        else
            {
                System.out.println("given value is not present in an array");
            }
        
        sc.close();

    }
}
