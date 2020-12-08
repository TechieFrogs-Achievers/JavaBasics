package Arrays;
import java.util.*;
public class ArrayExample12 
{
   public static void main(String[] args) 
   {
    int n,sum=0;
    Scanner sc=new Scanner(System.in);//scanner method
    System.out.println("Enter elements in array: ");
    n=sc.nextInt();
    int arr1[]=new int[n];
    System.out.println("enter all elements:");
    //sum of elementes present in the given array
    for(int i=0;i<n;i++)
    {
        arr1[i]=sc.nextInt();
        sum=sum+arr1[i];//addition
    }
    System.out.println("total sum="+sum);//display total sum
   } 
}
