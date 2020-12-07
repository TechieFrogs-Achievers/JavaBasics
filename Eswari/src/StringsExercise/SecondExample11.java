package StringsExercise;

import java.util.Scanner;

//class for converting uppercase to lowercase
public class SecondExample11 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                      //scanner class for taking input from user
        String str = scan.nextLine();                               //string creation
        //char strArray[] = str.toCharArray();
        //String str1 ="";

        //taking string buffer because setCharAt() method is not there for string
        StringBuffer sb = new StringBuffer(str);                    

        for(int i= 0; i < str.length(); i++)                //loop is iterated until the string is there
        {
            if(Character.isLowerCase(str.charAt(i)))            //checking whether character is lower case or not
            {
                //str1 = str1.setCharAt(i,Character.toUpperCase(str.charAt(i)));
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));               //if character is lowercase then set to uppercase
            }
            //checking for character is uppercase or not
            else if(Character.isUpperCase(sb.charAt(i)))         
            {
                //if character is uppercase then set to lowercase
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
        }
        System.out.println("The string after changing is : " +sb);
        scan.close();                   //scanner class closing
        
    }
    
}
