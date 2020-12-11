import java.util.Scanner;
public class Array24 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        System.out.println("Enter array elements : ");
        int arr[]= new int[size];
        for(int i =0 ; i < size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Even numbers in array are : ");
        for(int i = 0 ; i< size ; i++)
        {
            if(arr[i] % 2 == 0 )
            {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Odd numbers in array are : ");
        for(int i = 0 ; i< size ; i++)
        {
            if(arr[i] % 2 != 0)
            {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }   
}
