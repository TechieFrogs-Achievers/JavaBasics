import java.util.*;
public class Exception20 {
    public static void main( String[] arg) {
        int age;
        Scanner sc = new Scanner(System.in);
        try
        {
        System.out.println("Please Enter your age : ");
        //throws Exception as if the input string is of illegal format for parsing as it as null or alphanumeric.
        age = Integer.parseInt(sc.next());
        System.out.println("Your age is : " +age);
        } catch(NumberFormatException e)
        {
        System.out.println("The NumberFormatExceptionoccure.");
        System.out.println("Please enter the valid age.");
        }
        }
        }

