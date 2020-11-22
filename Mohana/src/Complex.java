public class Complex 
{
    int real1 , real2;
    int imaginary1,imaginary2;
Complex( int r1,int r2, int im1,int im2)
{
    real1=r1;
    real2= r2;
    imaginary1 = im1;
    imaginary2 =im2;

} 
public void sum()
{
    int real = real1 +real2;
    int img  = imaginary1+imaginary2;
    System.out.println("addition of two complex num = " +real +"+"+img + "i" );
} 
public void difference()
{
    int real = real1- real2;
    int img = imaginary1 - imaginary2;
    System.out.println( " subtraction of two complex num = "+real + "+"+img+ "i");
} 
public void product()
{
    int real = real1 * real2;
    int img = imaginary1 * imaginary2;
    System.out.println(" product of two numbers = "+ real + "+"+img+ "i" );
} 
public static void main(String[] args) 
{

    Complex c = new Complex(9, 5, 7,3);
    c.sum();
    c.difference();
    c.product();

}
    
}
