package TypeCasting;

public class NarrowingExample 
{
    public static void main(String[] args) 
    {
        double d_value=20.548798521;
        int int_value=(int)d_value;//manual casting: double to int
        short s_value=(short)d_value;//double to short
        byte b_value=(byte)int_value;
        System.out.println("double to int: "+int_value);//20
        System.out.println("double to short: "+s_value);//20
        System.out.println(" int to byte : "+b_value);//20
        
 }
}
