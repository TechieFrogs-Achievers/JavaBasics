package Exceptions;

public class Exceptions24
{
    public static void main(String[] args)
     {
        try
        {   
            System.out.println("parent try block");

            //child try block1

            try
            { 

                System.out.println("first try");
                
                int a[] = {1,3,5,5};

                System.out.println(a[8]);
            }

            //catch block to handle exception
            
            catch(ArrayIndexOutOfBoundsException aie)
            {
               System.out.println(aie); 
            }


               //child try block 2

               try
                { 
                   System.out.println("second try"); 
                  
                     int num = 30/0; 

                     System.out.println(num);

            
                //child try block 3
                try
                {
                    String name = null;

                    System.out.println(name.length());
                }


                    catch(ArrayIndexOutOfBoundsException aie) //catch block to handle array index out of range exception
                    {
                       System.out.println("array index exceeds"); 
                    }


                }


                catch(NullPointerException ne)//catch block to handle null pointer exception
                {
                    System.out.println("provide value to string");
                }
            

            catch(ArithmeticException ae)//to handle divide by 0 
            {
               System.out.println("divide by 0 cant perform");
            } 
        }
            catch(Exception e)//to handle any kind of exception
            {
                System.out.println(e);
            } 

             //it excutes at any time
            finally 
            {
                System.out.println("Finally block");
            }
    }
}
