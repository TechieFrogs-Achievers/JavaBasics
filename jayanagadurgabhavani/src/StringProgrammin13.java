public class StringProgrammin13 
{
    public static void main(String[] args) 
    {
        StringBuffer str = new StringBuffer();
        str.append("Jaya");// add string to string buffer
        str.append(" is");
        str.append(" awesome.");
        System.out.println("StringBuffer: " + str);

        // clear the string
        // using setLength()
        str.setLength(0);
        System.out.println("Updated StringBuffer: " + str);
    }
}
