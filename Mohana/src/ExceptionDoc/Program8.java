package ExceptionDoc;

public class Program8 
{
    public int method(int a, int b)//method having two parameters
    {
       return a/b;
    }
    //overload method having double as parameters
     public double method(double c, double d)throws Exception 
    {
       return   (c * d);
    }
    public static void main(String[] args) throws Exception 
    {
        Program8 e = new Program8();
        e.method(48,0);
        e.method(1.3,5.0);//throws an exception because we declared at method
    }
        
}
    

