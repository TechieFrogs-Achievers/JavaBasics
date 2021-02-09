public class Narrowing 
{
 public static void main(String[] args) 
 {
        //using cast operator to convert from one data type to another
    
        double value = 5.67;
        float a = (float)value;
        int b = (int)a;
        short c = (short)a;
        byte e = (byte)c;

        int x = 115;
        char ch = (char)x;

        //print all the values

        System.out.println("The value is"+value);
        System.out.println("The float value is"+a);
        System.out.println("The int value is"+b);
        System.out.println("The short value is"+c);
        System.out.println("The byte value is"+e);
        System.out.println(ch);

    }
}
