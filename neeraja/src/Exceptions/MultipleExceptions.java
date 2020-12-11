package Exceptions;

public class MultipleExceptions {

    public static void main(String[] w){
        //exception handler
        try{    
            int a[]=new int[5];    
            a[7]= 90;//throws array index outof bounds exception
           } 
           //Arithmetic exception handler 
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              } 
            //Arrayindexout of bounds exception
            catch(ArrayIndexOutOfBoundsException a)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              } 
            //generic exception catch all types of exceptions
            catch(Exception v)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }  
              finally{
                System.out.println("this is finally block");
              } 

              int a=10;
              System.out.println(a);
    }
    
}
