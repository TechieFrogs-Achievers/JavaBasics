package polymorphism;

public class TypeCasting {
    public static void main(String args[])  
    {  
        byte b = 50;  
          
        //type casting int to byte 
        b = (byte)(b * 2);  
        System.out.println(b); 

        //casting char to byte
        char c='f';
        byte bi;
        bi=(byte)c;//type mismatch we can not convert from char to byteusing type promotion
        System.out.println("char :"+c+ "  "+"byte :"+b);

        //casting in expressions
        int a=50;
        float f=20.369f;
        long l=3456789456L;

        short result=(short)((f*l)/a);
        System.out.println(result);

    }
    
}
