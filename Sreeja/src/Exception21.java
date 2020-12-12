public class Exception21
 {
    public static void main(String[] args) 
    {
        //code to be checked for an exception
        
        try
        {  
            
            int myArray[]=new int[5];       //initialize array    
            myArray [5]=10/0;    
        } 
        //multiple catch blocks
        catch(ArithmeticException e)        //to handle arithmetic exception   
        {  
            System.out.println("Arithmetic Exception :: Divide by zero!!");  
        }
        catch(ArrayIndexOutOfBoundsException e)         //to handle arrayindexoutofbounds exception
        {  
            System.out.println("ArrayIndexOutOfBounds :: Accessed index out of bounds");  
        } 
        catch(Exception e)          //to handle in any other case  
        {  
            System.out.println(e);  
        }       
        System.out.println("rest of the code");    
    }
}
