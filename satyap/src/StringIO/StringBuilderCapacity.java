package StringIO;
import java.util.*; // Package for Scanner class
public class StringBuilderCapacity
{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(); //StringBuilder class
        Scanner sc=new Scanner(System.in); //Scanner class
        String str=sc.next(); // Taking input from consule of string datatype
        System.out.println(str);
        sb.capacity(); // capacity of StringBuilder
        System.out.println(sb.capacity());
        sb.ensureCapacity(20); // Adding capacity for StringBuilder
        System.out.println(sb.capacity());
        sc.close(); // Scanner class close
        
    }
}
