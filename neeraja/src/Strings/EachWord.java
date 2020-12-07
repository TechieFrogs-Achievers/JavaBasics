package Strings;

import java.util.Scanner;

public class EachWord {
    public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        String word[]=str.split(" ");  

        String finalString="";  

        for(String a:word){  

        //String eachword=a.substring(0,1);  
       // String remainingString=a.substring(1);  
        finalString+=a.toUpperCase()+" ";  
    }
    System.out.println(finalString);
}
    
}
