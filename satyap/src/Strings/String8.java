package Strings;
//import java.util.*;
public class String8 
{
    void divideString(String str,int n)
    {
        if(str.length() %n!=0)
        {
            System.out.println("Invalid Input:");
        }
        int size=str.length()/n;
        for(int i=0;i<str.length();i++)
        {
            if(i%size==0)
            {
                System.out.println();
                System.out.print(str.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        //String str=sc.next();
        String str="aaaabbbbcccc";
        String8 s=new String8();
        s.divideString(str,3);
       // sc.close();

    }
}
