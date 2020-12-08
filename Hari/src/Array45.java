import java.util.Scanner;
public class Array45 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        String arr[] = new String[size];
        System.out.println("Enter values of an array : ");
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = sc.next();
        }
        for(int i=0 ; i < size ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }   
}
