package scanner;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Examin2 {
    public static void main(String args[]){  
        
        //using findinline method
           String str = "Hello World!";  
           //Create a new scanner Object  
           Scanner scanner = new Scanner(str);
           // scanner.close(); 
           //Find a string "World"  
           System.out.println("Output: " + scanner.findInLine("World")); 
           System.out.println("Output: "+scanner.findInLine(Pattern.compile(".ello")));  
           System.out.println("Output: "+scanner.findInLine(Pattern.compile(" ")));   
           //Print the rest of the string  
           System.out.println("Left String: " + scanner.nextLine()); 
           scanner.close();  
            
    }    
    
}
