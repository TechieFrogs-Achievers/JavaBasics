package Arrays;
import java.util.*;
//import java.lang.*;
public class StandardDeviation  // class to print standard deviation of given values
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // scanner class
        int length=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<arr.length;i++) // for loop for taking values into array
        {
            arr[i]=sc.nextInt();
        }
        int sum=0; // variables
        double sd=0.0;
        for(int i=0;i<arr.length;i++) //for loop for adding the array elements in an array
        {
            sum=sum+arr[i];
        }
        int mean=sum/arr.length; // mean for all the elements
        System.out.println(mean);
        
        for(int i=0;i<arr.length;i++) // for loop to print standard deviation
        {
            sd=sd+Math.pow(arr[i]-mean,2);
            
        }
        System.out.println(Math.sqrt(sd/arr.length)); // print sd 
        sc.close(); // scanner close
    

    }
}
