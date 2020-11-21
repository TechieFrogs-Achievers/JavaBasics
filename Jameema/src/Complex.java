public class Complex 
{
    int real;
    double imag;
    public void sum(int a , int b, double c , double d )
    {
        real=a+b;
        imag=c+d;
        System.out.println("the add of real and imag num is :" +real+ "+" +imag+"i");
    }
    public void Product(int a , int b, double c , double d)
    {
        real=a*b;
        imag=c*d;
        System.out.println("the product of real and imag num is :" +real+ "*" +imag+"i");

    }
    public void difference(int a , int b, double c , double d)
    {
        real=a-b;
        imag=c-d;
        System.out.println("the substraction of real and imag num is :" +real+ "-" +imag+"i");

    }
    public static void main(String[] args)
     {
         Complex c = new Complex();
         c.sum(8, 7, 4.6, 8.9);
         c.Product(8, 10, 9.0, 8.1);
         c.difference(15, 9, 26, 9);
        
    }
    
}
