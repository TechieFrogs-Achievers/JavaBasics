import java.util.Random;
public class String110 
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        Random rm = new Random();
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
        int length = 4 ;
        for(int i = 0; i < length ; i++ )
        {
            int index = rm.nextInt(str.length());
            char ch = str.charAt(index);
            sb.append(ch);
        }
        String ch1 = sb.toString();
        System.out.println("Required string is : " + ch1);
    }   
}
