package Strings;

import java.util.Scanner;

public class StringClear {
    public static void main(String[] args) 
    {
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in) ; //Scanner class
        //String str = sc.nextLine();
        StringBuffer sc1 = new StringBuffer(); //string buffer
        String str1 = sc.nextLine();
        String str2 = sc.nextLine(); //innput value
        //System.out.println("the string is" +str);
        sc1.append("jemi");
        sc1.append(str1); //adding string
        sc1.append(str2);
        System.out.println(sc1); //printing the string
        //System.out.println(str1);
        sc1.delete(2,7); //deleting within the index
        System.out.println("after deleting  : " +sc1);
        sc1.setLength(5); //it gives the string for particular length
        System.out.println("after setting the length :  "+sc1);
        sc1=new StringBuffer(); //it clear entire string
        System.out.println("after deleting  :" +sc1);
        //System.out.println(sc);
        sc.close();  
    }
   
    
}
