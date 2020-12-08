package Stringmethods;
import java.util.*;
public class StringExample14 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);//scanner class is used for taking input from user
        System.out.println("enter string one:"); 
        String str1 = scan.nextLine();
        System.out.println("enter  string two:");
        String str2 = scan.nextLine();

        //if one string is rotated to another string then it's length is same so then first check two strings length
        if(str1.length() == str2.length())
        {
            String str3 = str1 + str1;//the first string is added to first string and stored in string3

            //if string2 is there in string3 then it is rotated to string1
            if(str3.contains(str2))
            {
                System.out.println("Second string is rotated to first string");
            }
            //if string2 is not there in string3 then it is not rotated to string1
            else
            {
                System.out.println("Second string is not rotated to first string");
            }
        } 

        //if length of two strings are not equal then it is not possible to one string is rotated to another string
        else
        {
            System.out.println("The two strings length's are not same then one string is rotated to another string");
        }
        scan.close();           //scanner close

    }
}
