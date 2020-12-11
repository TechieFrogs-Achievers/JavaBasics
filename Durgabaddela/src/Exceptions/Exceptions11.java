package Exceptions;

public class Exceptions11 
{
    public static void main(String[] args) {
        
    //try and catch blocks
    try{    
        int a[]=new int[5];    
        a[9]= 12;//throws array index outof bounds exception
       } 
       //Arrayindexout of bounds exception handler by catch block
       catch(ArrayIndexOutOfBoundsException aie)  
       {  
        System.out.println("Arithmetic Exception occurs");  
       } 
       //Arithmetic exception handler by catch block
       catch(ArithmeticException ae)  
          {  
           System.out.println("Arithmetic Exception occurs");  
          } 
        
        //valid for all type of exceptions
        catch(Exception e)  
          {  
           System.out.println("this is main class exception");  
          }
        }
}
