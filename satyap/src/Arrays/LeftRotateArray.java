package Arrays;
import java.util.*;
public class LeftRotateArray  // CLass for shifting the digits to left rotation of given number
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); // scanner class
        int length=sc.nextInt(); // length of array
        int arr[]=new int[length]; //array intization
       // int arr[]=new int[]{1,2,3,4,5,6};
        int n=2; //shifting n=2 for two digits left
        System.out.println("Original Array:");
        for(int i=0;i<arr.length;i++) // storing array elements
        {
            arr[i]=sc.nextInt();
            //System.out.println(arr[i]);
        }
        for(int i=0;i<n;i++) 
        {
            int j,first=arr[0]; 
            for( j=0;j<arr.length-1;j++) //shifting elements in left rotation
            {
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        System.out.println("Left Rotation:");
            for(int i=0;i<arr.length;i++) // printing array elements after rotation
            {
                System.out.println(arr[i]);
            }  
            sc.close(); // scanner class close
        }
    }

