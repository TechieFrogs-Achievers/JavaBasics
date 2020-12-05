package Strings;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String s1 = s.nextLine();
        int vowels =0,consonants =0;
        String s2 = s1.toLowerCase(); //converting string to lowercase

        for (int i=0;i<=s2.length()-1;i++){
            char c = s2.charAt(i);   //for gettiing character at each i value

            if(Character.isLetter(c)){  //if character is aplpahbet it will check further condition

                if (c=='a' ||  c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    vowels++;
                }
                else 
                consonants++;
            }
            else //other than alphabets it will skip that character
            continue;
            
        }
        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants :" + consonants);
    }
}
