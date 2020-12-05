package Stringmethods;

public class StringClass14 
{
    public static void main(String[] args) 
    {

    StringBuffer str = new StringBuffer(); // create a string buffer

    // add string to string buffer
    str.append("java");
    str.append(" is ");
    str.append("object oriented");
    System.out.println("StringBuffer: " + str);

    // clear the string
    // using new
    // here new object is created and assigned to str
    str = new StringBuffer();
    System.out.println("Updated StringBuffer: " + str);
    }
}
