package StringExamples;

import java.util.Scanner;

public class StringBufferEx2 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);  
       String name = sc.nextLine();//taking input from keyboard 
       StringBuffer sb = new StringBuffer();
       sb.append(name);//append to string buffer
       System.out.println(name);
       sb.delete(1, 3); //deleting characters from index 1 to 3
       System.out.println(sb);
       sb.reverse();//it reverses the string
       System.out.println(sb);
       sc.close();
              
    }
    
}
