package Strings;

public class RemoveSpaces 
{
    public static void main(String[] args)
    {
        
        String s = "This     is a string class   .Hi";
        System.out.println("Original sentence: " + s);

        s = s.replaceAll("\\s", "");//method to clear all the spaces
        System.out.println("After replacement:" +s);
    }
}
