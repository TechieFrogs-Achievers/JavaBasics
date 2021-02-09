import java.util.*;
public class Stringreverse 
{
    public static void main(String[] args)
    {

     
    /*{
        String s = "shirin";
        String reverse="";
        for(int i= s.length()-1; i>=0; i--)
        {
             reverse = reverse+s.charAt(i);
        }
        System.out.print("The reverse string is :" +reverse);
        
    }*/
    /*{
        String s="Shirin";
        StringBuffer sb = new StringBuffer(s);
        System.out.println("the reverse the string is :" + sb.reverse());
    }*/
    Scanner sc = new Scanner(System.in);
    //String reverse ="";
    System.out.println("Enter the string");
    String s= sc.nextLine();
    String reverse="";
    int length = s.length();
    for( int i = s.length()-1; i>=0; i--)
    {
        reverse = reverse+s.charAt(i);
    }
    System.out.println("the reverse :" +reverse);
}



    
}
