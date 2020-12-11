package Exceptions;

public class ArithmeticException {

    public static void main(String args[])  {
        try{
           int arr[] ={1,2,3,4,5};
            arr[5]=10;
           System.out.println(arr[5]/0);
        }
         //exception handler three
         //catch(ArithmeticException e){
           // System.out.println("The specified index does not exist ");
        // }
        //exception handler one
        catch(NullPointerException e) {
            System.out.println("This is null pointer exception ");
         }
            //exception handler two
         catch(StringIndexOutOfBoundsException e){
            System.out.println("The specified index does not exist ");
         }
        
            //exception handler three
         catch(ArrayIndexOutOfBoundsException e){
           System.out.println("The specified index does not exist ");
        }
           //exception handler with generic exception which can caught all types of exceptions
        catch(Exception e){
            System.out.println(e);
            System.out.println("This is generic exception ");
         //}
       }
    
}}
