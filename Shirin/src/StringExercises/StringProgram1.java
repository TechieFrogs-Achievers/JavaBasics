package StringExercises;
import java.util.*;

public class StringProgram1 
{
    public static void main(String[] args) 
    {   
        System.out.println("enter the sentence");
        Scanner sc = new Scanner(System.in);//creating object to scanner
        String sentence = sc.nextLine();// data member
        int l = sentence.length();// length of the sentence
        System.out.println(l);//printing 
        sc.close();// closing scanner class
        
    }
    
}
