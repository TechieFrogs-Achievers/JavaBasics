package Arrays;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcat 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); //user input
        int n=sc.nextInt(); //read an elem
        int arr[]=new int[n]; //elemnts store in arr
        int arr1[]=new int[n];
        int arr2[]=new int[arr.length+arr1.length]; // stores two arrs in anoter arr
        for(int i=0;i<arr2.length;i++) //loop for read an elem
        {
            arr2[i]=sc.nextInt(); //read an arr elem
        }
        System.arraycopy(arr,0,arr1,0,arr.length); //arr and arr1 concat with len
        System.out.println(Arrays.toString(arr2)); //conve arr to string
        sc.close();

    }
}
