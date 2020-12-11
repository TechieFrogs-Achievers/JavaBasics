public class Exception4 {
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
       Exception4 e4=new Exception4();
       e4.method3();
       System.out.println("End of program"); 
    }
}
