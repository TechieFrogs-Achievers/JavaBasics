import java.util.Random;
public class String11
 {
     public static void main(String[] args) 
     {
       //creating strings of alphabets and numerics
       
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";        
        String numeric = "0123456789";

        String alphanumeric = alpha+numeric;            //combining the two strings

        StringBuilder sb = new StringBuilder();         //creating stringbuilder

        Random rm = new Random();           //creating random object

        int length = 7;         //assigning length of random string

        for(int i=0;i<length;i++)
        {
            int index = rm.nextInt(alphanumeric.length());      //generating random index number

            char ch = alphanumeric.charAt(index);           //get the character from the string
            sb.append(ch);              //append the char to stringbuilder
        }

        String str = sb.toString();

        System.out.println("Random alphanumeric string is:"+str.toLowerCase());



    }
}
