package ExceptionDoc;

/*class NotFound
{
   void method1()
   {
       System.out.println("method from first class");
   }
}*/


public class Program12 
{
    public static void main(String[] args) 
    {  
        //try and catch blocks to handle exceptions
        try 
        {  
            Class.forName("NotFound"); //class method used to create an instance of class to 
           // NotFound nf = new NotFound();
            //nf.method1();
            
        }
         catch (ClassNotFoundException e) //it handles n exception 
         { 

            System.out.println("Class not found ");
        }
        
    }
    
}
