public class Exception6 
{
    public static void main(String[] args) 
    {
        //code to be checked for an exception
        try
        {
            int arr[] = {1,2,3,4};      //initializing the array
            System.out.println(arr[4]);

            //another try block in one try block
            //code to be checked for an exception
            try
            {
                int number = arr[2] / 0 ;
                System.out.println(number);
            }
            catch(ArithmeticException e)        //to handle arithmetic exception
            {
                System.out.println("Arithmetic exception - divide by zero");
            }


        }
        catch(ArrayIndexOutOfBoundsException e)         //to handle exception
        {
            System.out.println("ArrayIndexOutOfBoundsException - index is out of range");
        }
    }
}
