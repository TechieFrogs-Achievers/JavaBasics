import java.util.*;
public class String18 
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);        //create scanner class object

        System.out.println("enter string");

        String str = sc.next();         //read the string from user and stores in str

        char ch[] = str.toCharArray();      //coverting string to character array

        System.out.println("characters are");

        //loop to print the characters
        
        for(char ch1 : ch)
        {
            System.out.print(" "+ch1);
        }

        sc.close();


    }
}
