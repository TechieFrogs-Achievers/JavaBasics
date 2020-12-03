package StringIO;
import java.util.Scanner;

public class StringClass
{
    public static void main(String args[])
    {
        int rollNo;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name:");
        String name=sc.next(); // IO for String datatype for one token
        System.out.println(name);
        System.out.print("Enter Fullname:");
        String fullName=sc.next(); // IO for String datatype for one line
        System.out.println(fullName);
        System.out.print("Enter LastName:");
        String lastName=sc.nextLine(); // IO for String datatype for one line
        System.out.println(lastName);
        System.out.print("Enter Rollno:");
        rollNo=sc.nextInt(); // IO for integre datatype
        System.out.println(rollNo);
        //sc.close();
    }
}
