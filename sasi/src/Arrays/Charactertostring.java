package Arrays;

import java.util.Scanner;

//import sun.nio.cs.ext.MacIceland;

public class Charactertostring 
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in); //scanner class 
        int length=sc.nextInt(); //len of a char
        System.out.println("enter the charcters:");
        char ch[]=new char[length]; //char arr
        for(int i=0;i<ch.length;i++)
        {
            ch[i]=sc.next().charAt(0); 
        }
        String s=String.valueOf(ch); //char convert  to string by using valueof meth
        System.out.println(s);
        System.out.println("enter string:");
        String str=sc.next();//enter string notat
        for(int i=0;i<length;i++)//loop for stroe char into char arr
        {
            ch[i]=str.charAt(i);//splitting  string in char using charAt func
        }
        for(int i=0;i<length;i++)//loop for printing char arr
        {
            System.out.print(ch[i]+" ");
        }
        sc.close();
    }
}
