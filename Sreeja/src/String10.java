import java.util.Random;
public class String10 
{
     public static void main(String[] args) 
     {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";      //assigning string

        StringBuilder sb = new StringBuilder();         //creating string bulder

        Random rm = new Random();           //creating an object for random

        int length = 5;     //assigning the lenght of random string

        for(int i = 0; i < length ; i++)
        {
            int index = rm.nextInt(str.length());           //generating random index number

            char ch = str.charAt(index);            //get the character from string
            sb.append(ch);                          //append the character
        }
        String ch1 = sb.toString();          

        System.out.println("Random string is: "+ ch1 );

    }
}
