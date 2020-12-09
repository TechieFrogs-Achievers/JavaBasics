import java.util.*;
public class ArraysEx5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);            //to create scanner class object

        System.out.println("Enter size");

        int size = sc.nextInt();                //to get the size from user

        int array[]= new int[size];             //initializing array size

        System.out.println("Enter integer  elements");

        for(int i=0;i<size;i++)             //loop to get array elements from user
        {
            array[i] = sc.nextInt();
        }

        System.out.println("Elements in the array are:");
        for(int i:array)                        //for-each loop to print array elements
        {
            System.out.print(" "+i);
        }

        sc.close();

    }
    
}
