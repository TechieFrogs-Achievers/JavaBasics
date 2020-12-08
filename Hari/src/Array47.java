import java.util.Arrays;
public class Array47 
{
    public static void main(String[] args)
    {
        char ch[] = {'h', 'a' , 'r' ,'i'};
        String str = new String(ch);    // converting char array to string
        System.out.println(str);
        String string = "Iam Hari";
        char ch1[] = string.toCharArray();   // converting string to char array
        System.out.println(Arrays.toString(ch1));
    }   
}
