package StringExamples;

import java.util.Scanner;

public class Program24 
{
    public static void main(String[] args) 
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();//taking input from keyboard
       
        for(int i = 0;i <= s1.length()-1;i++)
        {
            char ch = s1.charAt(i);//string value given to char

            if( ((ch >= 'a')&& (ch <= 'z')) ||((ch >='A') &&(ch <= 'Z'))||(ch >='0') &&(ch <='9') )//condition
            {
                continue;
            }
            else{
                count++;
            }
 
        }
        System.out.println(count);
        sc.close();
    }
    
}
