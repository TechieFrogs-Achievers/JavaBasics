package Arrays; // Package of Arrays
import java.util.*; // Package for Scanner class
public class CopyArray  // class of Copy of one array to another array
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); // Scanner class
        int length=sc.nextInt(); 
        int arr1[]=new int[length];
        //int arr1[]=new int[]{1,2,3,4,5};
        int arr2[]=new int[length];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        arr2=arr1.clone();
        System.out.println("Elements in original array:");
        for(int i=0;i<arr1.length;i++) // printing array elements of first array
        {
            System.out.println(arr1[i]);
        }
        System.out.println();
        System.out.println("Elements in new arrays:"); // printing array elements of second array
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]+" ");
        }
        sc.close();
    }
}
