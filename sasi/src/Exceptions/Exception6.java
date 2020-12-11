package Exceptions;

import java.util.Scanner;

public class Exception6 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);   //scanner class object
        String str = sc.nextLine();   //string creation
        int length = sc.nextInt();
        int arr[]= new int[length];    // initializing the array to store the data
        for(int i=0;i<length;i++)
        {
            arr[i] = sc.nextInt();    //reads the array elements
        }
        try    //try block that runs outside of the loop
        {
            str = null;
            System.out.println("the length of a string is:"+str.length());
        try
        {
            System.out.println("the array element:"+arr[length+1]);   //prints the incrementedlength
        }
        catch(ArithmeticException e)   //inner catch block
        {
            System.out.println("exception :"+e);
        }
        catch(ArrayIndexOutOfBoundsException i)
        {
            System.out.println("Exception:"+i);
        }
    }
    catch(NullPointerException p)
    {
        System.out.println("exception is:"+p);      //outer block
    }
    System.out.println("rest of the code:");   //prints the end 
    sc.close();    //scanner close
}

}
