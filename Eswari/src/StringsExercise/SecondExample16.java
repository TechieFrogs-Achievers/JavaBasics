package StringsExercise;

import java.util.Scanner;

//class for printing reverse of a string
public class SecondExample16 
{
    public static void main(String[] args) 
    {
        Scanner scan =  new Scanner(System.in);                 //scanner class giving input from user
        String str = scan.nextLine();                           //creating string
        String temp ="";

        //creating string buffer because reverse method is not there for string
        StringBuffer sb = new StringBuffer(str);                   
        sb.reverse();                                   //reverse method is used for reversing the given string
        System.out.println("The reverse string is :" +sb);

        //second way for printing string in reverse order
        for(int i= str.length()-1; i >=0 ;i--)
        {
            temp = temp + str.charAt(i);
        }
        System.out.println(temp);
        scan.close();                                   //scanner class closing
    }
    
}
