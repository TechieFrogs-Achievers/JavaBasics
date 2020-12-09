import java.util.Random;
public class String111 
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        Random rm = new Random();
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
        String numbers = "0123456789" ;
        String alphanumeric = alphabets + numbers ;
        int length = 6 ;
        for(int i = 0 ; i < length ; i++ )
        {
            int index = rm.nextInt(alphanumeric.length());
            char ch = alphanumeric.charAt(index);
            sb.append(ch);
        } 
        String ch1 = sb.toString();
        System.out.println(ch1);
    }   
}
