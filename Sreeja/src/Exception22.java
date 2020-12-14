public class Exception22 
{
     public static void main(String[] args) 
     {
        //code to be check for an exception
        try
        {
            //initializing variables
            
            int x = 56 ;
            int y = 0 ;

            int c = x / y ;         //division operation
            System.out.println("The value of c is "+c);
        }
        catch(ArithmeticException e)        //to handle exceptions
        {
            System.out.println("Arithmetic exception - divide by zero");
        }

        //another try block
        try
        {
            int arr[] = new int[4];         //create array

            arr[6] = 5;             //entering value to 6th index
            System.out.println("The value of element is "+arr[6]);

        }
        catch(ArrayIndexOutOfBoundsException e)         //to handle the exceptions
        {
            System.out.println("index out of bound");
        }
    }
}
