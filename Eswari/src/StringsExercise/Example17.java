package StringsExercise;

import java.util.Scanner;

public class Example17 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);                      //scanner method
        String str = scan.nextLine();                               //string value giving at run time
        StringBuffer sb = new StringBuffer(str);                    //string buffer creation
        for(int i = 0;i < str.length();i++)
        {
            //System.out.println(i);
            //System.out.println(sb.charAt(i));
            System.out.print(sb.charAt(i));                     //printing every character
        }
        scan.close();                               //scanner close
    }
    
}
