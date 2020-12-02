package StringIO;
import java.util.*;
public class HasNext1
{
    public static void main(String[] args)
    {
       // String s="Hello World";
        Scanner sc=new Scanner(System.in); //Scanner class
        String str=sc.next(); // Scanner class cretaing str in String datatype 
        System.out.println(str);
        System.out.println("Result:"+sc.hasNext());
       
        System.out.println("Final Result:"+sc.hasNext());
        System.out.println("String:"+sc.nextLine());
       // sc.close();
    }
}
