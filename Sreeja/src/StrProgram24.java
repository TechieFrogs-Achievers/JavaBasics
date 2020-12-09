import java.util.*;
public class StrProgram24
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two strings");

        //read the strings from the user
       
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();


        System.out.println("Before swaping"+str1+" "+str2);

        str1 = str1+str2;       //to combine the two strings
        str2 = str1.substring(0,str1.length()-str2.length());       //to get string1      
        str1 = str1.substring(str2.length());       //to get string2 in string1
        
        System.out.println("After Swaping:"+str1+" "+str2);

        sc.close();
    }
}
