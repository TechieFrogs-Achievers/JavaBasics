import java.util.*;
public class String13 
{
    public static void main(String[] args)
     {
        StringBuffer str = new StringBuffer("hai");         //creating string buffer with initializing

        Scanner sc = new Scanner(System.in);            //creating scanner class object

        System.out.println("Enter 2 strings");

        //read the strings from user
        
        str.append(sc.next());
        str.append(sc.next());

        System.out.println("String buffer is:"+str);

        str.setLength(0);       //using setlength() method to clear the string buffer
        System.out.println("new string buffer is:"+str);

        sc.close();
    }
}
