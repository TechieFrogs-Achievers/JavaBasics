public class Complex 
{
     int real;
     int imaginary;
     void sum( int r1, int r2 , int i1, int i2 )
     {
         float real = r1 + r2;
         float imaginary = i1 + i2;
         System.out.println(" the sum of real and imaginary number is: " +real+ "+" +imaginary+ "i");
        
     }
     void difference( int r1, int r2 , int i1, int i2)
     {
        float real = r1 - r2;
        float imaginary = i1 - i2;
        System.out.println(" the difference of real and imaginary number is: " +real+ "+" +imaginary+ "i");
        
    }
    void product(int r1, int r2 , int i1, int i2)
    {
        float real = r1 * r2;
        float imaginary = i1 * i2;
        System.out.println((" the product of real and imaginary number is: " +real+ "+" +imaginary+ "i"));
        
    }
    public static void main(String[] args) 
    {
        Complex c = new Complex();
        c. sum(12, 15 , 17 , 20);
        c. difference(21, 25 , 30 , 32);
        c. product(31, 16 , 18 , 40);
        
    }
        
          
    
    
}
