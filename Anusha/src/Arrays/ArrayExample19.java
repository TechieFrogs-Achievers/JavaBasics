package Arrays;
import java.util.*;
public class ArrayExample19 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);//scanner method
    System.out.println("Enter size of array : ");
    int size = sc.nextInt();
    int []arr1 = new int[size];
    System.out.println("Enter the elements:");
    for (int i = 0; i < size; i++)//print the elements
    {  
        arr1[i] = sc.nextInt();            
    }  
     Arrays.sort(arr1);//sort the elements
     System.out.println("sorted array: "+Arrays.toString(arr1));
     int max=arr1[1];//find 2rd smallest element in the array
     System.out.println("2rd smallest element in the array: "+max);
    }
}
