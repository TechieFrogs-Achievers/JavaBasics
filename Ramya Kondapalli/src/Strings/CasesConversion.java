package Strings;

public class CasesConversion {
    public static void main(String[] args) {
        
        StringBuffer s =  new StringBuffer("raMya KonDPaLLi");

        for (int i=0;i<s.length();i++){

            Character c = s.charAt(i);

            if(Character.isLowerCase(c)){
                s.replace(i, i+1, Character.toUpperCase(c)+""); //replacing lowercase letters with upper case
            }
            else
                s.replace(i, i+1, Character.toLowerCase(c)+""); //replacing uppercase letters with lower case
            }
            System.out.println(s);  //RAmYA kONdpAllI
        }
    

    }
