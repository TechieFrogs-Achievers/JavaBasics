package Strings;

import java.util.Random;

public class RandomString {
    public static void main(String[] d){
        String s1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //String s2="1234567890";
        //String s3="abcdefghijklmnopqrstuvwxyz";

        //String randomString =s1+s2+s3;

        StringBuffer sf=new StringBuffer();
        //String sf=new String();
        Random r=new Random();
         int length=7;

         for(int i=0; i<length;i++){
             int index=r.nextInt(s1.length());
              char c=s1.charAt(index);
              sf.append(c);
         }
         System.out.println(sf);

    }
    
}
