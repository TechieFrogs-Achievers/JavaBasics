import java.util.Scanner;
public class Array4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        String arr[] = new String[size];
        System.out.println("Enter array elements : ");
        for(int i = 0; i < size ; i++ )
        {
            arr[i] = sc.next();
        }
        System.out.println("Duplicate elements are : ");
        for(int i = 0 ; i < size ; i++ )
        {
            for(int j = i+1 ; j < size ; j++ )
            {
                if(arr[i].equals(arr[j]))
                {
                    System.out.println(arr[j]);
                }
            }
        }
        sc.close();
    }   
}
