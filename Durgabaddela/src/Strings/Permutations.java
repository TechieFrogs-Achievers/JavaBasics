package Strings;

import java.util.Arrays;

public class Permutations 
{
    public static void main(String[] args) 
    {
        String s1="durga";
        String s2="lakshmi";
        String s3="lakshmidurga";
        int l1=s1.length();
        int l2=s2.length();
        int l3=s3.length();
        int l=l1+l2;//concatinate two strings
        System.out.println(l);
        String s=s1+s2;
        System.out.println(s);

        if(l!=l3){
            System.out.println("strings are not equal");
        }

        else{
             char[] c1=s.toCharArray();
             char[] c2=s3.toCharArray();
             Arrays.sort(c1);
             Arrays.sort(c2);//sort method to sort the string
             System.out.println(c1);
             System.out.println(c2);
             for(int i=0;i<l;i++)
             {
                if(c1[i]==c2[i])//checking sorting arrays
                {
                }
        }
        System.out.println("suffled strings");
    }
    }
}
