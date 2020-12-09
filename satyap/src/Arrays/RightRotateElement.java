package Arrays;
import java.util.*;
public class RightRotateElement 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]=new int[length];
        int n=2;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
            for(int i=0;i<n;i++)
            {
            int j,last=arr[arr.length-1]; 
            for( j=arr.length-1;j>0;j--) //shifting elements in left rotation
            {
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        System.out.println("Left Rotation:");
        for(int i=0;i<arr.length;i++) // printing array elements after rotation
        {
            System.out.println(arr[i]);
        }  
        sc.close(); // scanner class close
    }
}
