package TypeCasting;

public class LowerTohigh 
{
    public static void main(String[] args) 
    {
        // int to float converting
        int a = 20;
        float f = a;
        System.out.println(a);
        System.out.println(f);

        double d = 12.006;
       // double to long
        long l = (int)d;
        // long to int
        int n = (int) l;
        System.out.println("double number" +d);
        System.out.println("double to long  =" + " " +l);
        System.out.println("long to int =" +" " +n);
        

        
    }
    
}
