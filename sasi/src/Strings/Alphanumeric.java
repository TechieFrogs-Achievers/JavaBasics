package Strings;

import java.util.Scanner;

public class Alphanumeric 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        String upper=sc.nextLine();
        String lower=sc.nextLine();
        String num=sc.next();
       String  alphanumeric=upper+lower+num;
        StringBuffer sb=new StringBuffer(alphanumeric);
        Random r=new Random();
        for(int i=0;i<alphanumeric.length();i++)
        {
            int index=r.nextInt(alphanumeric.length());
            char randomchar = alphanumeric.charAt(index);
            sb.append(randomchar);
        }
        String randomsString=sb.toString();
        System.out.println(randomsString);
        sc.close();
        }
    }
    
