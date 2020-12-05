package StringExamples;

import java.util.Random;

public class Program11 
{
    public static void main(String[] args) 
    {
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        StringBuilder sb = new StringBuilder();//string buider object creation
        Random r = new Random(); //random object creation
        int length = 4;
        for(int i = 0;i <=length;i++)
        {
            int index = r.nextInt(alpha.length());//to get index value from string

            char rcharacter = alpha.charAt(index);//to get character value at index
            sb.append(rcharacter);//to append characters into string builder
        }
       //String value = sb.toString();
        System.out.println("Random characters : " +sb);
        
        
    }
    
}
