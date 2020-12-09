public class String113 
{
    public static void main(String[] args)
    {
        StringBuffer string = new StringBuffer();
        string.append("Hari");
        string.append(" is a");
        string.append(" good girl.");
        System.out.println(string);
        string.setLength(0); // setting length as zero
        System.out.println("Updated One is : " + string);
    }
}
