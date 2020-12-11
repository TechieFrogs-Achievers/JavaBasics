package Arrays;
import java.util.*;
public class NumberOfElements  // classfor Number of elements in array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // Scanner class for input from console
        int length=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<arr.length;i++) // for loop for stroing array elements
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(arr.length);
        sc.close(); // scanner close
    }
}
