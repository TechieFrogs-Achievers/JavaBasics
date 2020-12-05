package Strings;

import java.util.Scanner;

public class SubString {
    
    public static void main(String[] uh){
        Scanner s=new Scanner(System.in);
       // String s2=s.nextLine();
        int count=0;
        String s1=new String("destination is a gud destination");//if empty string it throws outofbounds exception
        
        //System.out.println(s1.substring(4, 9));
       // System.out.println(s1.contains("ion"));//true
       // System.out.println(s1.indexOf("rgh"));//-1(substring not present)
       // System.out.println(s1.indexOf("est")!=-1);//true
       // System.out.println(s1.indexOf('s'));//2

       //char[] a=s1.toCharArray();
       String word="destination";
      // String[] a=s1.split(" ");
       
      for(int i=0; i<=s1.length()- 1; i++) {
        if( (i =s1.indexOf(word, i)) != -1){
            count++;
           // System.out.println(a[i]);
        }
    } 
    /*int i=0;
    while (( i =s1.indexOf(word, i)) != -1 ){
 
        System.out.println("Found at index: " + i);
        count++;
        i++;
        
    } */
    System.out.println("no of repetion of word in a sentence "+count+" times");
    }
    
}
