import java.util.Scanner;
public class Array48 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        System.out.println("Enter array : ");
        String array[] = new String[size];
        for(int i = 0 ; i < size ; i++ )
        {
            array[i] = sc.next();
        }
        for(int i = 0; i < size; i++)
        {
            System.out.print(array[i]);
        }
        for(int i = 0; i < size; i++)
        {
            if(array[i].equals( "r"))
            {
                System.out.println("Yes, array contains r");
            }
        }
        sc.close();
    }   
}
