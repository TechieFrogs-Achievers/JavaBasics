package Strings;

import java.util.Scanner;
//program to convert upper to lower and vice versa
public class ToUpperAndLower {
    public static void main(String[] l){

        Scanner f=new Scanner(System.in);
        String h=f.nextLine();
        int k=h.length();
        StringBuffer d=new StringBuffer(h);
       // h=f.nextLine();

        for(int i=0; i<k ; i++){
            if(h.charAt(i)>='A' && h.charAt(i)<='Z'){
                d.setCharAt(i, Character.toLowerCase(h.charAt(i))); 
               //d.replace(h.charAt(i),Character.toLowerCase(h.charAt(i)));
            }
            else if(h.charAt(i)>='a' && h.charAt(i)<='z'){
                d.setCharAt(i, Character.toUpperCase(h.charAt(i))); 
               //d.replace(h.charAt(i),Character.toUpperCase(h.charAt(i)));
            }

        }
            System.out.println(d);
    }
    
}
