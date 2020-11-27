package polymorphism;

public class Typepromotion1
{
    public static void main(String[] a)
    {
        byte b;  
        int i = 851;  
        double d = 453.1492; 
        System.out.println("Conversion of int to byte.");  
          
        //Conversion of int to byte.
        b = (byte) i;  
        System.out.println("i = " + i + " b = " + b); 
        System.out.println("\nConversion of double to byte."); 
          
        //Conversion of double to byte.
        b = (byte) d;  
        System.out.println("d = " + d + " b= " + b); 

        //conversion from char to byte
        char c='f';
        byte bi;
       // bi=c;//type mismatch we can not convert from char to byteusing type promotion
        System.out.println("char :"+c+ "  "+"byte :"+b);

    }
    
}
