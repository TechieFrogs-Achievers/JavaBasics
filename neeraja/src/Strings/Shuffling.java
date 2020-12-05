package Strings;

import java.util.Arrays;

public class Shuffling {
    public static void main(String[] yg){
        String s1="neeraja";
        String s2="bejawada";
        String s3="neerajabejawada";
        int l1=s1.length();
       // System.out.println("1"+l1);
        int l2=s2.length();
       // System.out.println("2"+l2);
        int l3=s3.length();
       // System.out.println("3"+l3);
        int l=l1+l2;
       // System.out.println(l);
        String s=s1+s2;
       // System.out.println(s);

        if(l!=l3){
            System.out.println("No");
        }

        else{
             char[] c1=s.toCharArray();
             char[] c2=s3.toCharArray();
             Arrays.sort(c1);
             Arrays.sort(c2);
             System.out.println(c1);
             System.out.println(c2);
             //char[] d=c1;
             //char[] f=c2;
             for(int i=0;i<l;i++){
                if(c1[i]==c2[i]){
                  }
        }
        System.out.println("yes string is valid shuffle of two strings");
    }


    }
    
}
