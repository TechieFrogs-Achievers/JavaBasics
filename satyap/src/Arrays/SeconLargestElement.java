package Arrays;
import java.util.*;
public class SeconLargestElement 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<arr.length;i++) //for loo[ for stroing elements
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0]; // assigning max value arr elelment index 0
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max) //if element is greater than max value
            {
                max=arr[i]; // assign largest value to max
            }
        }
        //System.out.println("largest element in array:"+max);
        System.out.println("Second largest element:"+arr[arr.length-2]);
        sc.close(); // scanner close
    }
}
