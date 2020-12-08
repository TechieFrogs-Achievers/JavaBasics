import java.util.Scanner;
public class Array39 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int size = sc.nextInt();
        int array[] = new int[size];
        int max = array[0];
        for(int i = 0 ; i < size ; i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i = 0 ; i < size ; i++)
        {
            if (max < array[i])
            {
                max = array[i];
            }
        }
        System.out.println("Largest element of an array is : " +  max);
        sc.close();
    }   
}
