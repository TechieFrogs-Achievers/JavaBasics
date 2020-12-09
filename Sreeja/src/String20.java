import java.util.*;
public class String20 
{
    public static void main(String[] args)
     {
        
        Scanner sc = new Scanner(System.in);        //create Scanner class object

        System.out.println("Enter two strings");

        //read the strings from the user

        String str = sc.nextLine();
        String str1 = sc.nextLine();
        
        //using indexOf method to check the strings

        if(str.indexOf(str1)==-1)
        {
            System.out.println(str1+"is not present in the "+str);
        }
        else
        {
            System.out.println(str1+"is present in the "+str);
        }

        sc.close();


    }
}
