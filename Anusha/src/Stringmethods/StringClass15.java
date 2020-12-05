package Stringmethods;

public class StringClass15 
{
    public static void main(String[] args)
    {
       // create a string
   String name = "anusha jakkam";

   // create two substrings from name
   // first substring contains first letter of name
   // second substring contains remaining letters
   String first_Letter = name.substring(0, 1);
   String remaining_Letters = name.substring(1, name.length());

   // change the first letter to uppercase
   first_Letter = first_Letter.toUpperCase();

   // join the two substrings
   name = first_Letter + remaining_Letters;
   System.out.println("Name: " + name);
   } 
}
