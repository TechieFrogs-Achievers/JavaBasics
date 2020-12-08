public class String114 
{
    public static void main(String[] args)
    {
        StringBuffer string = new StringBuffer();
        string.append("Venky ");
        string.append("Jani ");
        string.append(" Hari");
        string.append(" Hema");
        System.out.println(string);
        string = new StringBuffer(); // creating new object
        System.out.println(string);
    }   
}
