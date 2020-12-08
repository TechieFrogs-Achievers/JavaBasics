import java.util.Scanner;
public class Array8 
{
    public static void main(String []args)  
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of string :");
        int size = sc.nextInt();
        System.out.println("Enter array elements : ");
        int arr[] = new int[size];
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements in even places are : ");
        for(int i = 0 ; i < size ; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }   
}
