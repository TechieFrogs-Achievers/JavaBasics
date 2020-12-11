package Arrays;
import java.util.*;
public class ConcatenationOfArrays  // class for printing two arrays concatenating 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); //scanner class
        int length=sc.nextInt();
        int arr1[]=new int[length]; //arrays notations
        int arr2[]=new int[length];
        for(int i=0;i<arr1.length;i++) //for loop for array1 stroing elements
        {
            arr1[i]=sc.nextInt();
        }
        for(int j=0;j<arr2.length;j++) // for loop for array 2 stroing elements
        {
            arr2[j]=sc.nextInt();
        }
        int result[]=new int[arr1.length+arr2.length]; // taking result as array var for stroing two arrays addition
        System.arraycopy(arr1, 0, result, 0, arr1.length); //copying the arrays
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        System.out.println(Arrays.toString(result));//print the concatenate array
        sc.close();//scanner close
    }
}
