package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
       String s1 = "License";
       String s2 = "Silence";

       boolean status = true;

       if (s1.length() != s2.length()){ //if length are not equal they are not anagrams
           status = false;
       }
       else{
           //converting strings to lower ase and array
           char[] array1 = s1.toLowerCase().toCharArray();
           char[] array2 = s2.toLowerCase().toCharArray();
           //array sorting
           Arrays.sort(array1);
           Arrays.sort(array2);
           
           status = Arrays.equals(array1, array2);
       }

       if (status == true){
           System.out.println( s1 + " "+ s2 + " are Anagrams");
       }
       else 
            System.out.println(s1 + " " + s2 + " are not anagram");
    }
}
