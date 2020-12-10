package Arrays;
import java.util.*;
public class SumOfElements // class for printing sum of array elements
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // scanner class
        int length=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<arr.length;i++) // for loop for storing array elements
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++) // for loop for print sum of array elements
        {
            sum=sum+arr[i];
        }
        System.out.println("sum of elements:"+" "+sum);
        sc.close();// scanner close
    }
}
