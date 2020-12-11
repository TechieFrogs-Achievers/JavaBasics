package StringExercises;

import java.util.Scanner;

public class StringProgram12
{
    public static void main(String[] args)
    {
        System.out.println(" Enter the String ");
        Scanner sc =  new Scanner(System.in);// scanner class
        StringBuffer sb = new StringBuffer();//  creating object for string buffer
        String str1 = sc.nextLine();
        sb.append("programming");// method
        sb.append(str1);
        //System.out.println(" clear the string :"  +sb.delete(0, 5));// delete the particular length
        // sb.setLength(4);
         //System.out.println(" clear the entire string : " + sb);// it display the string based on the length
         sb = new StringBuffer();
         System.out.println(sb);// it deletes entire string 
         sc.close();// closing scanner class
        
        
        
    }
    
}
