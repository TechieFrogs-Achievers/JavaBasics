import java.util.Scanner;
import java.util.Arrays;
public class Array46 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String Size : ");
        int size = sc.nextInt();
        int size1 = sc.nextInt();
        String s1[] = new String[size];
        String s2[] = new String[size1];
        String s3[] = new String[size+size1];
        System.out.println("Enter any two strings");
        for(int i = 0 ; i < size ; i++ )
        {
            s1[i] = sc.next();
        }
        for(int i = 0 ; i < size1 ; i++ )
        {
            s2[i] = sc.next();
        }
        System.arraycopy(s1, 0, s3, 0, size);
        System.arraycopy(s2, 0, s3, size, size1);
        System.out.println(Arrays.toString(s3));
        sc.close();
    }   
}
