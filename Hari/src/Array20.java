import java.util.Scanner;
public class Array20 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();
        System.out.println("Enter array : ");
        int arr[] = new int[size];
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        for( int i = 0 ; i < size ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        for(int i = 0 ; i < size ; i++)
        {
            for(int j = i+1 ;  j < size ; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp  = arr[i];
                    arr[i] = arr[j] ;
                    arr[j] = temp ;
                }
            }
        }
        System.out.println();
        for(int i = 0; i< size ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Smallest number in array is : " + arr[0]);
        sc.close();
    }   
}
