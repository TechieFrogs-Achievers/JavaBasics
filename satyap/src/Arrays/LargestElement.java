package Arrays;
import java.util.*;
public class LargestElement  // class for printing largest elements in an array
{
    public static void main(String[] args) {
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
        System.out.println("largest element in array:"+max);
        sc.close(); // scanner close
    }
}
