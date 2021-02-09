package TypeCasting;

import java.util.Scanner;

public class HighTolow 
{
    public static void main(String[] args) 
    {
        Scanner sc = new  Scanner(System.in);
        // integer converting into char
        // int a = sc.nextInt();
        // char c = (char) a;
        // System.out.println("integer " +a);
        // System.out.println("char " +c); 
        
        // one data type converting into all data types
        int n = sc.nextInt();
        long l = n;
        float f = l;
        double d = f;
        System.out.println(n);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        sc.close();       // scanner class close

        
    }
    
}
