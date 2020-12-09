package Strings;

import java.util.Scanner;
//program to capatalize first charecter 
public class Capatalize {
    public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        //splitting the string at spaces
        String word[]=str.split(" ");  
        
        String finalString="";  
        //iteraring through array 
        for(String a:word){  

        String eachword=a.substring(0,1);//storing first charecter
        String remainingString=a.substring(1); //storing substring
        finalString+=eachword.toUpperCase()+remainingString+" "; //final string 
    }
    System.out.println(finalString);//display final string
}
       
}