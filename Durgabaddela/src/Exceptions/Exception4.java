package Exceptions;

 class Exception4
{
    //method which throws an exception
     void divide(int num1, int num2) throws ArithmeticException
    {
       System.out.println("the division of two numbers"+num1/num2);
    }
    public static void main(String[] args)
     {
        Exception4 e = new Exception4();//creation of object for class
        //try block for chances of getteing exception
        try
        {
        e.divide(4,0);
        }
        catch(ArithmeticException ae)//catch block to handle the exception
        {
            System.out.println(ae);

        }

    }
}
