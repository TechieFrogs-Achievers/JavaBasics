public class StringProgramming12 
{
    public static void main(String[] args) 
    {
        
    StringBuffer str = new StringBuffer();// create a string buffer
    str.append("Jaya");// add string to string buffer
    str.append(" is");
    str.append(" good .");
    System.out.println("StringBuffer: " + str);

    // clear the string
    // using delete()
    str.delete(0, str.length());
    System.out.println("Updated StringBuffer: " + str);
    }
}
