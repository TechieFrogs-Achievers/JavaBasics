package Strings;

import java.util.Random;
import java.util.Scanner;

public class StringsExample11 
{
    public static void main(String[] args) 
    {
        //string with all characters
        //String s ="abcdefghijklmnopqrstuvwxyz";
        Scanner scan = new Scanner(System.in);
        System.out.println("enter  a Alphanuberic String"); 
        String s = scan.next();
        StringBuilder sb = new StringBuilder();//ojject for stringbuilder class
        Random r = new Random();//object for random class
        int length = 4;
        for(int i=0 ;i<=length; i++)
        {
            int starting = r.nextInt(s.length());//creating random integers

            char ch = s.charAt(starting);//storing the character at index of s
            
            sb.append(ch);// append the character 

        }
        System.out.println("random AlphanumericString ="+sb);//printing the random values
        scan.close();

    }

}



    

