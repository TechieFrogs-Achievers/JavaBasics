import java.util.Scanner;
public class Array38 
{
    public  static void main(String[] args)
    {
        int sum = 0 ;
        double avg = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();
        System.out.println("Enter an array : ");
        int arr[] = new int[size];
        for(int i = 0; i < size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < size ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        for(int i = 0 ; i < size ; i++)
        {
            sum = sum + arr[i];
        }
        avg = sum / size ;
        System.out.println("The average of array is : " + avg);
        sc.close();
    }   
}
