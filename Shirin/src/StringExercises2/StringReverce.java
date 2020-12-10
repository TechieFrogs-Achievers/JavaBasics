package StringExercises2;

import java.util.Scanner;

public class StringReverce 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the string :");
        Scanner sc = new  Scanner(System.in);//scanner class
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer("shirin");//string buffer class
        sb.append(str);// appending str string
        sb.reverse();// it reverse both strings
        System.out.println(sb);
        sc.close();// closing scanner class
        
    }

        
    
}
