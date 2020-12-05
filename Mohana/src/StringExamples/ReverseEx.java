package StringExamples;

import java.util.Scanner;

public class ReverseEx 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B = new StringBuffer(A) .reverse().toString();
        if(A.equals(B))
        {
            System.out.println("Yes");
        } 
        else
        {
            System.out.println("No");
            
        }
        sc.close();
    }
    
}
