package Exceptions;

public class ExceptionHandling4 
{
    //method by using throws for arithmeticexception
    void method1() throws ArithmeticException
    {
        throw new ArithmeticException("calculate error");
    }
    void method2() throws ArithmeticException
    {
        method1();
    }
    void method3()
    {
        try{
            method2();
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException handled:");
        }
    }
    public static void main(String[] args) 
    {
       ExceptionHandling4 e4=new ExceptionHandling4();//object creation
       e4.method3();//method calling
       System.out.println("End of program"); 
    }
}
