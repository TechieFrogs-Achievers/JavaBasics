public class Exception22
{
    public static void main(String args[]){
        
            //main try-block
            try{
              //try-block2
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
                      System.out.println(" handled in try-block3");
                  }
              }
              catch(ArithmeticException e){
                 System.out.print("Arithmetic Exception");
                 System.out.println(" handled in try-block2");
              }
          }
          catch(ArithmeticException e3){
              System.out.print("Arithmetic Exception");
               System.out.println(" handled in main try-block");
          }
          catch(ArrayIndexOutOfBoundsException e4){
              System.out.print("ArrayIndexOutOfBoundsException");
               System.out.println(" handled in main try-block");
          }
          catch(Exception e5){
              System.out.print("Exception");
               System.out.println(" handled in main try-block");
           }
           
        }
} 

