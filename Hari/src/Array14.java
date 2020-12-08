import java.util.Scanner;
public class Array14 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();
        System.out.println("Enter any array : ");
        int arr[] = new int[size];
        for(int i = 0; i < size ; i++ )
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < size ; i++)
        {
            for(int j =i+1 ; j < size ; j++)
            {
                if( arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp ; 
                }
            }
        }
        int arr1[] = new int[size];
        for(int i = 0; i < size ; i++)
        {
            arr1[i] = arr[i] ;
        }
        System.out.println("The ascending order is : ");  
        for(int i = 0 ; i < size ; i++)
        {
            System.out.print( arr1[i] + " ");
        }
        sc.close();
    }   
}
