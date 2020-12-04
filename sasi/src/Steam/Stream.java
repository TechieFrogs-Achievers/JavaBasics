package Steam;

import java.math.BigDecimal;
import java.util.Scanner;

public class Stream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        System.out.println("integer:"+i);
        byte b=sc.nextByte();
        System.out.println("byte:"+b);
        String s=sc.next();
        System.out.println(" this is a string:"+s);
        String s1=sc.nextLine();
        System.out.println(" this is another string:"+s1);
         float f=sc. nextFloat();
        System.out.println(" this is a float:"+f);
        short s2= sc.nextShort();
        System.out.println("this is short:"+s2);
        double d =sc.nextDouble();
        System.out.println("this is double:"+d);
        long l=sc.nextLong();
        System.out.println("this is a  long "+l);
        BigDecimal bd=sc.nextBigDecimal();
        System.out.println(" this is bigdecimal:"+bd);
    }
}
