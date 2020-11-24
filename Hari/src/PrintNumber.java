class Method1 
{
    static int printn ( int i)
    {
        return i ;
    }
    static float printn ( float f)
    {
        return f ;
    }
    static double printn ( double d)
    {
        return d ;
    }
    static long printn ( long l)
    {
        return l ;
    }
    static String printn ( String str)   
    {
        str = " I am Hari " ;
        return str ;
    }
}
public class PrintNumber
{
    public static void main(String[] args)
    {
        System.out.println(Method1.printn(4.5));
        System.out.println(Method1.printn("abc"));
    }
}
