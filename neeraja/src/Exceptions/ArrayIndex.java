package Exceptions;

public class ArrayIndex {

    public static void main(String args[]) {
        try{
           int arr[] ={1,2,3,4,5};
           System.out.println(arr[7]);
           System.out.println(arr[-2]);
        }
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
        //exception handler three
        catch(NegativeArraySizeException e) {
         System.out.println("This is negitive array index Exception ");
      }
           //exception handler with generic exception which can caught all types of exceptions
        catch(Exception e){
            System.out.println("This is generic exception ");
         }

         finally{
            System.out.println("This is finally block ");
         }
       }
    
    
}
