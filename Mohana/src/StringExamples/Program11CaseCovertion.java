package StringExamples;

import java.util.Scanner;

public class Program11CaseCovertion 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); //creating scanner class obj
        String name =sc.nextLine();//taking string input
        StringBuffer sb = new StringBuffer();//creating buffer class obj
         sb.append(name);//appending name into string buffer
        System.out.println("previous string : " +sb);

        int length = sb.length();//string length

        for(int i = 0; i <= length-1;i++)
        {
            char ch = sb.charAt(i);//converting string into characters
            if(Character.isLowerCase(ch))//condition to check lowe case or not
            {
                sb.replace(i, i+1, Character.toUpperCase(ch)+""); 
            }
            else{
                sb.replace(i, i+1, Character.toLowerCase(ch)+ "");
            }
        } 

        System.out.println("after changes :" +sb);
        sc.close();
        
    }
    
}
