public class Exception23
{
    public static void main(String args[]){
        try{
             int arr[]= {1,2,3,4};
             System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e4){
            System.out.print("ArrayIndexOutOfBoundsException");
             System.out.println(" handled in main try-block");
        }
        finally
        { 
            System.out.println("finally block executed"); 
        } 
          
        // rest program will be executed 
        System.out.println("Outside try-catch-finally clause"); 
       
}
}