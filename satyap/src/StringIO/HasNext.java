package StringIO; // package for own class
import java.util.*; // package for Scannner
public class HasNext // class
{
    public static void main(String[] args)
    {
        String str="Hello World"; // string datatype
        Scanner sc=new Scanner(str); // scanner obj
        System.out.println("Boolean result:"+sc.hasNextBoolean()); // validation for boolean hasnext()
        while(sc.hasNext())
        {
            System.out.println(sc.next()); // validating and the printing the string hello
        }
        sc.close(); // closing the scanner class
    }
}
