package Strings;

import java.util.Scanner;

public class Replace {
    public static void main(String[] kn){

       Scanner s=new Scanner(System.in);
       String sq=new String("i am student");
     
       String s1=sq.replaceAll(" ","");//replace method remove spaces in thee string
       System.out.println(s1);//iamstudent

       String s4=sq.replace(' ','t');//replace space wi th some other charecter
       System.out.println(s4);//itamtstudent

       String s2=sq.replace("am","@");//replacing some string with other  string
       System.out.println(s2);//i @ student

       String s3=sq.replace('i','d');//replacing charecter with other charecter
       System.out.println(s3);

    }
    
}
