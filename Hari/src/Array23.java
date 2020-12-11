import java.util.Scanner;
public class Array23 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // instantiating size of array
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        // instatiating elements of array
        System.out.println("Enter elements of array : ");
        int arr[] = new int [size];
        for(int i = 0; i< size ; i++)
        {
           arr[i] = sc.nextInt();
        }
        // Ascending order of an array 
        for(int i = 0; i < size ; i++)
        {
            for(int j = i+1; j< size; j++)
            {
                // swapping of terms
                if(arr[i] > arr[j])  
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp ;
                }
            }
        }
        System.out.print("Ascending order is : ");
        for(int i = 0 ; i < size ; i++)
        {
            System.out.print( arr[i] + " ");
        }
        System.out.println();
        // Descending order of an array 
        for(int i = 0; i< size ; i++)
        {
            for(int j = i+1; j < size ; j++)
            {
                // swapping of terms
                if(arr[i] < arr[j])
                {
                    int temp1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp1;
                }
            }
        }
        System.out.print("Descending order is : ");
        for(int i = 0 ; i< size ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
