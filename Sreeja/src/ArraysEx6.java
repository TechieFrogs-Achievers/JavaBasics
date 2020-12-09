import java.util.*;
public class ArraysEx6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);            //create scanner class object

        System.out.println("Enter size of array");

        int size = sc.nextInt();            //read the size from user
        
        int array[] = new int[size];            //initializing array size

        System.out.println("Enter integer elements");

        for(int i=0;i<size;i++)             //loop to get array elements from user
        {
            array[i] = sc.nextInt();
        }

        System.out.println("Reverse elements are");

        for(int i=size-1;i>=0;i--)             //loop to print elements in reverse order
        {
            System.out.print(" "+array[i]);
        }

      
        sc.close();


    }
}
