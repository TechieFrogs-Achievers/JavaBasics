package Arrays;
import java.util.*;
public class ArrayExample6 
{
    //take return method for reverse of array elements
    public static int[] reverseArray(int[] input)
    {
        int[] reverse=new int[input.length];
        for(int i=0,j=reverse.length-1;i<input.length;i++,j--)
        {
          reverse[j]=input[i];
        }
        return reverse;
    }
    static void disply(int[] input) //parameterized  method for display values
    {
     for(int counter=0;counter<input.length;counter++)
     {
         System.out.println(input[counter]);
     }
    }
    public static void main(String[] args) 
    {
        //int[] marks={11,22,33,44,55,66};
        Scanner sc=new Scanner(System.in);//scanner class
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int []arr1 = new int[size];
        System.out.println("Enter the elements:");    
        for (int i = 0; i < size; i++)//print elements
        {  
            arr1[i] = sc.nextInt();               
        }     

        int[] reverse_order;//take array
        reverse_order=reverseArray(arr1);//store reverse elements
        System.out.println("reverse array elements");
        disply(reverse_order);//calling display method
     }
}
