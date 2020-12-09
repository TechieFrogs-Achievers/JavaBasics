import java.util.*;
public class ArraysEx14 
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);        //create scanner class object

        System.out.println("Enter array size");

        int size = sc.nextInt();            //read the size

        System.out.println("enter integer elements");

        int arr[] = new int[size];          //initialize the size of array

        for(int i=0;i<size;i++)             //loop to read the elements from user
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Entered elements are:");
        for(int i=0;i<size;i++)             //loop to print the entered elements
        {
            System.out.print(" "+arr[i]);
        }

        int temp;

        for(int i=0;i<size;i++)             
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]>arr[j])           //condition to check the smallest number
                {
                    temp=arr[i];            //if it is true swaping of two numbers
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
               
            }
        }
        System.out.println();
        System.out.println("Sort in ascending order");

        for(int i=0;i<size;i++)             //loop to print the elements
        {
            System.out.print(" "+arr[i]);
        }

        sc.close();

    }
}
