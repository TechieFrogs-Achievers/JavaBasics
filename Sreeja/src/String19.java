import java.util.*;
public class String19 
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);        //create a scanner class object

        System.out.println("Enter two strings");

       //read the values from the user
       
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        //to check the condition using contains() method
       
        if(str1.contains(str2))        
        {
            System.out.println(str2+"is a substring of "+str1);
        }
        else if(str2.contains(str1))
        {
            System.out.println(str1+"is a substring of "+str2);
        }
        else
        {
            System.out.println("Both are different");
        }

        sc.close();
    }
}
