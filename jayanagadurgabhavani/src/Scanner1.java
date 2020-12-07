import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
public class Scanner1
 {
    public static void main(String[] args)
     {
        Scanner in=new Scanner(System.in);
        System.out.println("enter your name:");
        String Name = in.nextLine();
        System.out.println("name is:"+Name);
        System.out.println("enter phone_number");
        long phone_number=in.nextLong();
        System.out.println("phone_number:"+phone_number);
        System.out.println("roll_number");
        int roll_number=in.nextInt();
        System.out.println("roll_number:"+roll_number);
        System.out.println("enter your addres");
        String addres=in.next();
        System.out.println("addres:"+addres);
        System.out.println("salary");
        float salary=in.nextFloat();
        System.out.println("salary:"+salary);
        System.out.println("enter double value");
        double value=in.nextDouble();
        System.out.println("double value:"+value);
        System.out.println("enter short valu");
        short value1=in.nextShort();
        System.out.println("short valu:"+value1);
        System.out.println("enter Byte valu");
        byte value2=in.nextByte();
        System.out.println("byte value"+value2);
        System.out.println("enter bigdecimal value");
        BigDecimal value3=in.nextBigDecimal();
        System.out.println("bigdecimal value:"+value3);
        System.out.println("enter biginteger");
        BigInteger value4=in.nextBigInteger();
        System.out.println("biginteger value:"+value4);
        in.close();
    }
}
