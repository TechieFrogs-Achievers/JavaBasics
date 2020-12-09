package Strings;
import java.util.*;
public class Capacity
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); // Scanner class
        String str=sc.next(); // Taking input from console of string datatype
        StringBuffer sb=new StringBuffer(); // StringBuffer class
        System.out.println(str); 
        //sb.capacity();
        System.out.println(sb.capacity()); // capacity for StringBuffer
        sb.ensureCapacity(10); // adding capacity for StringBuffer
        System.out.println(sb.capacity());
        sb.ensureCapacity(50); // adding StringBuilder class capacity
        System.out.println(sb.capacity());
        sc.close(); // Scanner class close


    }
}
