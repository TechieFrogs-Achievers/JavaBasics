package Stringmethods;
import java.util.*; 
public class StringClass12 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer();
        System.out.println("Enter any string : ");
        str = str.append(sc.nextLine());
        System.out.println(str);
        // delete the content in the string
        str = str.delete(0,str.length());
        System.out.println("Modified one : " + str);
 
    }
}
