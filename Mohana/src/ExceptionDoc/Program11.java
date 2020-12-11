package ExceptionDoc;

public class Program11 
{
    public static void main(String[] args) 
    {

         //try and catch blocks
        try
        {    
           int a[]=new int[5];    
            a[7]= 12;//throws array index outof bounds exception 

            System.out.println(a[7]);
        } 
        

        //multiple catch  blocks to handle exceptions
       catch(ArrayIndexOutOfBoundsException aie) //Arrayindexout of bounds exception handler by catch block 
       {  
        System.out.println(aie);  
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
