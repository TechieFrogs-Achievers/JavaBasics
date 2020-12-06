package StringExamples;

import java.util.Scanner;

public class SwapPrgm24 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //taking strings input from keyboard
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println("before swap : " + " string1 : " +s1 + "   " + " string2 : " +s2);
        s1 = s1+s2;//adding two strings
        System.out.println(s1);
        s2 = s1.substring(0,s1.length()-s2.length()); 
        s1 = s1.substring(s2.length()); 
        System.out.println("after swap " +" string1 : " +s1 +"  " + " string2 : " +s2);
        sc.close();
        
    }
    
}
