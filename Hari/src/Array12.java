import java.util.Scanner;
public class Array12 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        System.out.println("Enter size of string : ");
        int size = sc.nextInt();
        System.out.println("Enter any string : ");
        int arr[] = new int [size];
        for(int i = 0 ; i < size ; i++ )
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i = 0; i < size; i++)
        {
            sum += arr[i];
        }
        System.out.println("Sum of elements in an array = " + sum);
        sc.close();
    }   
}
