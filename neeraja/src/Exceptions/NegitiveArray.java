package Exceptions;

public class NegitiveArray {

    public static void main(String args[]) {
        try{
           int arr[] ={1,2,3,4,5};
           //System.out.println(arr[7]);
           System.out.println(arr[-2]);
        }
        //exception handler 
        catch(NegativeArraySizeException e) {
            System.out.println("The specified index does not exist ");
         }
          //exception handler 
        catch(Exception e) {
            System.out.println("generic Exception ");
         }
       
       
    
}
}