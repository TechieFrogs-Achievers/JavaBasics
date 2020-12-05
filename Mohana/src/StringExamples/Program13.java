package StringExamples;

import java.util.Scanner;

public class Program13 
{
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("TechieFrogs");//string buffer creation
        Scanner sc = new Scanner(System.in);//scanner class 
        String name = sc.nextLine();//taking input from ketboard
        sb.append(name);//appending name into string buffer
        System.out.println("original string : " +sb);
        sb.setLength(4);//this method delets the old characters into garbage collector and gives the string output of required length
        System.out.println("cleared string : " +sb);
        sb.setLength(0);
        System.out.println("new string : "+sb);
        sc.close();
        
        
    }
    
}
