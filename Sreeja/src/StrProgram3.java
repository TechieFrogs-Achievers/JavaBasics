import java.util.*;
public class StrProgram3 
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);        //create scanner class object

        System.out.println("Enter the string");

        String sr = sc.nextLine();          //read string from the user

       int count = 0;

        for(int i=0;i<sr.length();i++)       
        {
            char ch = sr.charAt(i);         //getting each char from string

            if(ch=='.'||ch==','||ch==':'||ch==';'||ch=='!'||ch=='?')        //if condition to check the punctuations
            {
                count++;
            }
           
        }
        System.out.println("No of punctuation characters in a string are"+count);

        sc.close();
    }
}
