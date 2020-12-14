package Exceptions;

public class Exceptions14 
{
    public static void main(String[] args)
     {
         //try block 
        try{
            int a[]=new int[5];
            //Array has only 5 elements
            System.out.println(a[9]=2);
          }
          //catch block to handle the exception
          catch(ArrayIndexOutOfBoundsException e)
          {
             System.out.println ("Array IndexOutOfBounds exception is occured");
          }
    }
}
