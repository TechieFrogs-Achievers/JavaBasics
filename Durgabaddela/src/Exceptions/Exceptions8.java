package Exceptions;

public class Exceptions8 
{
     int method(int a, int b)//method1
    {
       return a/b;
    }
    //overload method throws an exception
    double method(double c, double d)throws Exception 
    {
       return   (c * d);
    }
    public static void main(String[] args) throws Exception 
    {
        Exceptions8 e = new Exceptions8();
        e.method(0,0);
        e.method(1.3,5.0);//throws an exception because we declared at method
    }
}
