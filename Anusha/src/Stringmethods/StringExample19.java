package Stringmethods;
import java.util.*;
public class StringExample19 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);//sccaner class
        System.out.println("Enter a string value :");
        String str=sc.nextLine();
        System.out.println("Enter a particular character ::");
        char ch = sc.nextLine().charAt(0);
        int count=0;
        //frequency of a character
        for(int i=0;i<str.length();i++)
        {
            if(ch == str.charAt(i))
            {
                count++;
            }
        }
        System.out.println("Frequency of the give character: "+count);
        sc.close();   
    }
}
