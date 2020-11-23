public class Complex 
{
    int real;
    double imag;
    public void sum(int a , int b, double c , double d ) //parameterised method
    {
        real=a+b;
        imag=c+d; //adding two numbers
        System.out.println("the add of real and imag num is :" +real+ "+" +imag+"i"); // printing real and imaginary values
    }
    public void Product(int a , int b, double c , double d)
    {
        real=a*b;
        imag=c*d; //multiplicating two values
        System.out.println("the product of real and imag num is :" +real+ "*" +imag+"i");

    }
    public void difference(int a , int b, double c , double d)
    {
        real=a-b;
        imag=c-d;
        System.out.println("the substraction of real and imag num is :" +real+ "-" +imag+"i"); //printing the diff of two values

    }
    public static void main(String[] args)
     {
         Complex c = new Complex(); //creating object to class
         c.sum(8, 7, 4.6, 8.9);
         c.Product(8, 10, 9.0, 8.1); //calling method using method
         c.difference(15, 9, 26, 9);
        
    }
    
}
