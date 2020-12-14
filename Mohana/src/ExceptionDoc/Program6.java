package ExceptionDoc;

public class Program6 
{
    public static void main(String[] args) 
    {   
        //try and catch to handle  exceptions

        //parent try block
        try
        { 
            System.out.println("parent try block");
            int num =30/0; //it throws an exception
            System.out.println(num);
        
            //Child try block1
            try
            {
               int a[] = {1,2,3};

               System.out.println(a[5]); //trying to print out of range 

            }  

            //catch block to handle exception
            catch(ArrayIndexOutOfBoundsException ae )
            {
                System.out.println("Array index exceeds ");
            } 
            
        } 
        //catch block to handle exception
       
             catch(ArithmeticException ae)
            {
                System.out.println("divide by 0 exception");
            }
        
    }
    
}
