public class Exception24 {
   public static void main(String args[]){
    
        try{     
            //try-block3
            int a=10;
            int b =0;
            int c =  a/b; //it shows Arithmetic Exception
            System.out.println(c);
          
            try{
               // int arr[]= {1,2,3,4};
                /* I'm trying to display the value of
                 * an element which doesn't exist. The
                 * code should throw an exception
                 */
                //System.out.println(arr[10]); it shows ArrayIndexOutOfBoundsException
            }catch(ArithmeticException e){
                System.out.print("Arithmetic Exception");
                System.out.println(" handled in try-block1");
            }
        }
            catch(ArrayIndexOutOfBoundsException e4){
                System.out.print("ArrayIndexOutOfBoundsException");
                 System.out.println(" handled in main try-block2");
            }
        }
        finally
        { 
            System.out.println("finally block executed"); 
        } 
          
        // rest program will be executed 
        System.out.println("Outside try-catch-finally clause"); 
       
        }
}


