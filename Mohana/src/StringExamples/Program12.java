package StringExamples;

import java.util.Scanner;

public class Program12 
{
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("mohana");//string buffer creation
        Scanner sc = new Scanner(System.in);//scanner class 
        String name = sc.nextLine();//taking input from ketboard
        sb.append(name);//appending name into string buffer
        System.out.println("original string : " +sb);
        sb.delete(0, sb.length());//it deletes the whole string
        System.out.println("clear string : " +sb);
        sc.close();
        
    }
    
}
