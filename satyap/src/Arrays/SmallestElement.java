package Arrays;
import java.util.*;
public class SmallestElement // class for smallest elements in an array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // scanner class
        int length=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<arr.length;i++) // for loop for storing array elements
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0]; // min value assign array elements index 0
        for(int i=0;i<arr.length;i++) // for loop for storing minimum value
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("largest element in array:"+min);
        sc.close();// scanner close
    }
}
