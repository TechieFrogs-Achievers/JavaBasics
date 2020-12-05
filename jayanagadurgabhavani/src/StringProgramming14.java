public class StringProgramming14 
{
    public static void main(String[] args) 
    {

    StringBuffer str = new StringBuffer(); // create a string buffer

    // add string to string buffer
    str.append("Jaya");
    str.append(" is");
    str.append(" awesome.");
    System.out.println("StringBuffer: " + str);

    // clear the string
    // using new
    // here new object is created and assigned to str
    str = new StringBuffer();
    System.out.println("Updated StringBuffer: " + str);
    }
}
