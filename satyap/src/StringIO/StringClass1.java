package StringIO; // package for own class
import java.math.BigDecimal; //package for bigdecimal dataype
import java.util.*; //package for Scanner

public class StringClass1 //class
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); // Scanner class
        System.out.print("Enter Employee ID:");
        byte id=sc.nextByte(); // IO for byte datatype
        System.out.println(id); 
        System.out.print("Enter Employee department ID");
        short id1=sc.nextShort(); // IO for Short datatype
        System.out.println(id1);
        System.out.print("Enter Employee name: ");
        String name=sc.next(); // IO for String datatype 
        System.out.println(name);
        System.out.println("Enter Employee salary:");
        double salary=sc.nextDouble(); // IO for double datatype
        System.out.println(salary);
        System.out.print("Salary cutoffs:");
        float salaryOff=sc.nextFloat(); // IO for float datatype
        System.out.println(salaryOff);
        System.out.print("Salary Big:");
        BigDecimal salaryBig=sc.nextBigDecimal(); // IO for Bigdecimal
        System.out.println(salaryBig);
        System.out.print("Long datatype:");
        Long num=sc.nextLong(); // IO for long datatype
        System.out.println(num);
        System.out.println("Boolean datatype:");
        boolean b=sc.nextBoolean(); // IO for boolean datatype
        System.out.println(b);

    }
}
