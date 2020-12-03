package ScannerClasses;

//importing scanner package
import java.util.Scanner;

public class ScannerClassses2 {
    public static void main(String[] args) {
        //creating object of scanner
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Integer value");
        int i = s.nextInt();  //for entering int value

        System.out.println("Enter float value");
        float f = s.nextFloat();  //for entering float value

        System.out.println("Enter long value");
        long l = s.nextLong();  //for entering long values

        System.out.println("Enter double value");
        double d = s.nextDouble();  //for entering double values

        System.out.println("Enter String ");
        String s1 = s.next();  //for entering string

        System.out.println("Enter long string");
        //for entering long string
        String s2 = s.next();
        String s3 = s.nextLine();

        System.out.println("Enter Boolean value");
        boolean b= s.nextBoolean();  //for entering boolean values

        System.out.println("Enter Byte value");
        byte b1 = s.nextByte();  //for entering byte values

        System.out.println("Enter Short value");
        short sh = s.nextShort();  //for entering shortvalues

        s.close();  //closing of scanner class

        //printing all input values through output stream
        System.out.println("Integer value :" + i);
        System.out.println("Float value :" + f);
        System.out.println("long value :" + l);
        System.out.println("Double value :" + d);
        System.out.println("Integer value :" + i);
        System.out.println("String  :" + s1);
        System.out.println("Long string :" + s3);
        System.out.println("Boolean value :" + b);
        System.out.println("Byte value :" + b1);
        System.out.println("Short value :" + sh);
    }
}
