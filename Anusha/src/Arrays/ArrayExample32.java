package Arrays;
import java.util.*;
public class ArrayExample32 
{
    public static void main(String[] args)
    {
        int p, q, count1 = 0, count2 = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in matrix:");
        p = s.nextInt();
        System.out.print("Enter number of columns in matrix:");
        q = s.nextInt();
        int a[][] = new int[p][q];
        System.out.println("Enter all the elements of matrix:");
        for (int i = 0; i < p; i++) //enter the elements
        {
            for (int j = 0; j < q; j++) 
            {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Given Matrix:");//display matric
        for (int i = 0; i < p; i++) 
        {
            for (int j = 0; j < q; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < p; i++) //check even or odd
        {
            for (int j = 0; j < q; j++) 
            {
                if((a[i][j] % 2) == 0)
                {
                    count1++;//count even numbers
                }
                else
                {
                    count2++;//count odd numbers
                }
            }
        }
        System.out.println("Even number frequency:"+count1);
        System.out.println("Odd number frequency:"+count2);
  
    }
}
