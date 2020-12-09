package StringExamples;

import java.util.Scanner;

public class RotationP14 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        String s2 = sc.nextLine();

        if(s1.length() == s2.length())//to check both strings having same length or not
        { 
            System.out.println("yes it is possible");

            String s3 = s1+s1;//combining two strings for rotation

            if(s3.contains(s2))//it checks if string3 contains string2 or not
            {  
                
                System.out.println(s2 +"  is rotation of   " +s1);
            } 


        }  

        else //if lengths are not equal the rotation impossible 
        {
            System.out.println("not possible");
        }
        sc.close();
        
        
    }
    
}
