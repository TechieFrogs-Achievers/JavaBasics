package StringExamples;

import java.util.Scanner;

public class Example1 
{
    public static void main(String[] args) 
    { 
        char[] c2 = {'s','t','r','i','n','g'};
        String ch ="Java";
        String name = new String(ch);
        Scanner sc = new Scanner(System.in);
     String sentence = sc.next();  
     System.out.println(c2);
     System.out.println(name);
     System.out.println(sentence); 
     System.out.println(sentence == name );//false because address are differnt 
     sc.close();
     
    }
}
