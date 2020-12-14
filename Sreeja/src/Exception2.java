public class Exception2 
{
  public static void main(String[] args) 
    {
        
    try
    {
        int arr[]=new int[7];       //initialize array
        arr[4]=30/0;
        System.out.println("Last Statement of try block");
     }
     catch(ArithmeticException e)           //to handle exception
     {
        System.out.println("Arithmetic exception - divide by zero");
     }
     catch(ArrayIndexOutOfBoundsException e)            //to handle exception
     {
        System.out.println("Indexoutofboundsexception");
     }
     catch(Exception e)         //to handle exception
     {
        System.out.println("Some Other Exception");
     }
     
  }
}

