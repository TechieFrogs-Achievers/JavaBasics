import java.util.Scanner;
public class Lexico 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any size : ");
        int size = sc.nextInt();                // size of the array
        String arr[] = new String [size];      // creating an object for an array
        for(int i = 0; i < size ; i++ )
        {
            arr[i] = sc.next();                // initialize the array
        }
        for(int i = 0 ; i < size ; i++ )
        {
            System.out.print(" " + arr[i]);        
        }
        for(int i = 0 ; i < size ; i++)
        {
            for(int j = i+1 ; j < size ; j++ )
            {
                if(arr[i].compareTo(arr[j]) > 0)    // comparing two words in an array lexicographiclly
                {
                    String temp = arr[i];
                    arr[i] = arr[j];               // swapping of two words
                    arr[j] = temp ;
                }
            }
        }
        System.out.println();
        System.out.println("The required output is : ");
        for(int i = 0 ; i < size ; i++)
        {
            System.out.print(" " + arr[i]);         // printing the lexicographically arranged words
        }
        sc.close();
    }   
}
