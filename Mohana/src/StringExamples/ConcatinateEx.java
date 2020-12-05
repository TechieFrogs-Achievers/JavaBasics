package StringExamples;

import java.util.Scanner;

public class ConcatinateEx 
{
    public static void main(String[] args) 
    {
        String s1 = "Mohana  ";
        String s2 = "Kemisetti";
        String s3 = s1.concat(s2);//it combines the two strings

        System.out.println(s3);

         //taking input from ketboard

        Scanner sc = new Scanner(System.in);
        String s4 = sc.nextLine();
        String s5 = sc.nextLine();
        System.out.println(s4.concat(s5));//here it  combines the two strings
        sc.close();



        
    }
    
}
