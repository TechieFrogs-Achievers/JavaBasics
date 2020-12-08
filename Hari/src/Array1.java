import java.util.Scanner;
public class Array1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        String []array = new String[size];
        for(int i = 0 ; i< size ; i++ )
        {
            array[i] = sc.next(); 
        }
        for(int i = 0; i < size ; i++ )
        {
            System.out.print(" " + array[i]);
        }
        String array1[] = new String[size];
        for(int i = 0 ; i < size ; i++)
        {
            array1[i] = array[i] ;
        } 
        System.out.println();
        for(int i =0 ; i < size ; i++)
        {
            System.out.print(" " +array1[i]);
        }
        sc.close();
    }   
}
