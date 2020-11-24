package MethodsPractices;

public class PrintNumber
{
    public static byte printn(byte n)//method to return byte
    {
        return n;
    }
    public static  short printn(short n)//method to return short number
    {
        return n;
    }
    public static int printn(int n)//method to return int number
    {
        return n;
    }
    public static char printn(char n)//method to return char number
    {
        return n;
    }
    public static float printn(float n)//method to return float number
    {
        return n;
    }
    public static long printn(long n)//method to return long number
    {
        return n;
    }
    public static double printn(double n)//method to return double number
    {
        return n;
    }
    public static void main(String[] args)
    {
        //printing the  different static type numbers 
        System.out.println("byte  ="+PrintNumber.printn(5));
        System.out.println("short ="+ PrintNumber.printn(125));
        System.out.println("int  ="+PrintNumber.printn(332));
        System.out.println("char  ="+PrintNumber.printn('c'));
        System.out.println("float  ="+PrintNumber.printn(5.8));
        System.out.println("long  ="+PrintNumber.printn(4653732l));
        System.out.println("double  ="+PrintNumber.printn(-563.99));

    }
}
